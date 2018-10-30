package ma.valueit.sofacws.resource;

import ma.valueit.core.errorhandling.businessexception.ResponseBody;
import ma.valueit.sofacws.manager.ProcedureManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiResource {
    @Autowired
    ProcedureManager procedureManager ;
    @GetMapping("")
    public ResponseEntity<ResponseBody<String>> home() {
        return new ResponseEntity<>(new ResponseBody<>(HttpStatus.OK, "Sofac Liste Noire REST API V1.0"), HttpStatus.OK);
    }

    @GetMapping("/about")
    public ResponseEntity<ResponseBody<String>> about() {
        return new ResponseEntity<>(new ResponseBody<>(HttpStatus.OK, "Sofac Liste Noire REST API V1.0"), HttpStatus.OK);
    }

    @GetMapping(value = "/listenoire", produces= MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<ResponseBody<?>> getTest(@RequestParam(name = "reference") String input ) {
        return new ResponseEntity<>(new ResponseBody<>(HttpStatus.OK,procedureManager.executeProcedure(input)), HttpStatus.OK);
    }
}
