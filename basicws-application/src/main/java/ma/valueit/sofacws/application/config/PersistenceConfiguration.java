package ma.valueit.sofacws.application.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableAutoConfiguration
@EnableJpaRepositories(
        basePackages = {
                "ma.valueit.sofacws.repository"
        }
)
public class PersistenceConfiguration {

    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;

    @Autowired
    //@Qualifier("jpaProperties")
    private JpaProperties jpaProperties;

    @Value("${entitymanager.packages.to.scan}")
    private String[] emPackagesToScan;

    @Bean
    @Primary
    public EntityManagerFactory entityManagerFactory(EntityManagerFactoryBuilder builder) {
        LocalContainerEntityManagerFactoryBean factoryBean = builder
                .dataSource(dataSource)
                .properties(getVendorProperties(dataSource))
                .packages(emPackagesToScan)
                .build();

        factoryBean.afterPropertiesSet();
        return factoryBean.getObject();
    }

    private Map<String, String> getVendorProperties(DataSource dataSource) {
        return jpaProperties.getHibernateProperties(dataSource);
    }

    @Bean

    public JpaTransactionManager transactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactory(builder));
    }

  //  @Bean("dataSource")
   // @ConfigurationProperties(prefix = "spring.datasource")
    // public DataSource dataSourceH2() {
      //  return DataSourceBuilder.create().build();
  //  }

    @Bean("dataSource")
    @Primary
    @ConfigurationProperties(prefix = "ora.datasource")
    public DataSource dataSourceOracle() {
        return DataSourceBuilder.create().build();
    }
    /*@Bean("jpaProperties")
    @ConfigurationProperties(prefix = "spring.jpa")
    public JpaProperties jpaProperties(){
        return new JpaProperties();
    }*/
}
