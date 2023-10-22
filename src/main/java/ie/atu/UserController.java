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

    @Autowired
    public UserController(RegistrationServiceClient registrationServiceClient) {
        this.registrationServiceClient = registrationServiceClient;
    }

    @PostMapping("/confirm-and-register")
    public String confirmAndRegister(@RequestBody UserDetails userDetails)
    {
        String confirm = registrationServiceClient.someDetails(userDetails);
        String responseMessage = confirm + " name: " + userDetails.getName() + " email: " + userDetails.getEmail();
        return responseMessage;
    }
}