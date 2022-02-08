package onthelive.ndp.pseudo.controller;

import onthelive.ndp.pseudo.model.UserDataDownloadResponseListDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.SecureRandom;

@Controller
@RequestMapping("/inkstore")
public class PseudoController {

    /*by userId*/
    @RequestMapping("/v1/user/{userId}")
    public ResponseEntity<UserDataDownloadResponseListDto> getByUserId(@PathVariable String userId){
        UserDataDownloadResponseListDto pseudo = new UserDataDownloadResponseListDto(
                "it is test - kind",
                99,
                "it is test - nextDataPointer",
                "it is test - previousDataPointer",
                100,
                true
        );

        return new ResponseEntity<>(pseudo, HttpStatus.OK);
    }

    @RequestMapping("/v1/tag/{tag}/data")
    public ResponseEntity getTage(@PathVariable String tag){
        UserDataDownloadResponseListDto pseudo = new UserDataDownloadResponseListDto(
                "it is test - kind",
                99,
                "it is test - nextDataPointer",
                "it is test - previousDataPointer",
                100,
                true
        );

        return new ResponseEntity<>(pseudo, HttpStatus.OK);
    }

    /*Stroke*/
    @RequestMapping("/v2/stroke/{userId}")
    public ResponseEntity getStroke(@PathVariable String userId){
        String pseudoUuid = "ABCDEFGHI__LMNOPQRSTUVWXYZ";
        return new ResponseEntity(pseudoUuid, HttpStatus.OK);
    }
}
