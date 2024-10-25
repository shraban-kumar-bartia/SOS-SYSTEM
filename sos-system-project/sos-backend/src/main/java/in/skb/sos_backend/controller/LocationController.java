package in.skb.sos_backend.controller;
// LocationController.java
import in.skb.sos_backend.model.LocationData;
import in.skb.sos_backend.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/location")
public class LocationController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/share")
    public String shareLocation(@RequestBody LocationData locationData) {
        try {
            System.out.println("Received Location Data: " + locationData.toString());
            emailService.sendLocationEmail(locationData);
            return "Location shared successfully!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to share location. Please try again.";
        }
    }

}

