package ma.valueit.sofacws.application.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;


/**
 * Created by valueit-mac-yelansari on 1/28/18.
 */
@Configuration
public class AppConfiguration {
    @Value("${message.source.basename}")
    private String msgBasename;
    @Value("${message.source.use.code.as.default.message}")
    private String msgUseCode;

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename(msgBasename);
        messageSource.setUseCodeAsDefaultMessage(Boolean.parseBoolean(msgUseCode));
        return messageSource;
    }
}

