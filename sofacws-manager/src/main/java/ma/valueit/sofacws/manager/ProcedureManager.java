package ma.valueit.sofacws.manager;


import ma.valueit.core.errorhandling.businessexception.BusinessException;
import ma.valueit.core.helpers.StringUtils;
import ma.valueit.sofacws.business.ProcedureService;
import ma.valueit.sofacws.manager.dto.ResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProcedureManager {
    @Autowired
    ProcedureService procedureService;
    public ResultDto executeProcedure(String input){
        ResultDto resultDto = new ResultDto();
        resultDto.setP_reference_tiers(input);
        if(StringUtils.isEmpty(procedureService.callProcedure(input))){
            throw new BusinessException("Ooops la procedure ne retourne rien");
        }
        resultDto.setP_flag_fichage(procedureService.callProcedure(input));
        return resultDto;
    }
}