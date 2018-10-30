package ma.valueit.sofacws.business;

import ma.valueit.sofacws.repository.ProcedureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcedureService {
    @Autowired
    ProcedureRepository procedureRepository;

    public String callProcedure(String input) {
        return procedureRepository.callProcedure_liste_noire(input);
    }
}