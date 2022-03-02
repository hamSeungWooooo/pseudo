package onthelive.ndp.pseudo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;

@Controller
@RequestMapping("/verify")
public class PseudoVerifyController {

    @GetMapping
    public ResponseEntity verifyGet(HttpServletRequest request) throws IOException {
        return getResponseEntity(request);
    }

    @PostMapping
    public ResponseEntity verifyPost(HttpServletRequest request) throws IOException {
        return getResponseEntity(request);
    }

    private ResponseEntity getResponseEntity(HttpServletRequest request) {
        String user_id = request.getParameter("user_id");
        String user_token = request.getParameter("user_token");
        String state = request.getParameter("state");

        HashMap<String, String> map = new HashMap<>();
        map.put("user_id", user_id);
        map.put("user_token", user_token);
        map.put("state", state);

        return new ResponseEntity(map , HttpStatus.OK);
    }

}
