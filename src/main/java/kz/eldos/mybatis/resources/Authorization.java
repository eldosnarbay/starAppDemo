package kz.eldos.mybatis.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.DatatypeConverter;

@RestController
@RequestMapping("")
public class Authorization {
    @GetMapping("/login")
    public ResponseEntity login(@RequestHeader(value = "Authorization") String auth){

        if(auth != null && auth.startsWith("Basic")){
            String credentials = auth.substring("Basic".length()).trim();
            byte[] decoded = DatatypeConverter.parseBase64Binary(credentials);
            String decodedString = new String(decoded);
            String[] actualCredentials = decodedString.split(":");

            String login = actualCredentials[0];
            String password = actualCredentials[1];

            if(!login.equals("eldos") || !password.equals("password")){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
            }
        }

        return new ResponseEntity<String>(auth, HttpStatus.OK);
    }
}
