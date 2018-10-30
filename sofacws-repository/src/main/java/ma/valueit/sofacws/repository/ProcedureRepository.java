package ma.valueit.sofacws.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;



@Repository
public class ProcedureRepository {
    @Autowired
    EntityManager entityManager;
    public String callProcedure_liste_noire(String input){
        StoredProcedureQuery query = entityManager
                .createStoredProcedureQuery("ICK_WSO2.LNO_GET_INFO_LISTE_NOIRE")
                .registerStoredProcedureParameter("p_reference_tiers", String.class,
                        ParameterMode.IN)
                .registerStoredProcedureParameter("p_flag_fichage", String.class,
                        ParameterMode.OUT)
                .setParameter("p_reference_tiers", input);
        query.execute();
        String result = (String) query.getOutputParameterValue("p_flag_fichage");
        return result;
    }
}