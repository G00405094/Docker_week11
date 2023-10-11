package ie.atu;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private RegistrationServiceClient registrationServiceClient;


    @PostMapping("/confirm-and-register")
    public Map<String,String>confirmAndRegister(@RequestBody UserDetails userDetails)
    {
        String confirm = registrationServiceClient.someDetails(userDetails);
        Map<String, String> responseMessage = new HashMap<>();
        responseMessage.put("message",confirm);
        return responseMessage;
    }
}