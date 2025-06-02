package CSW303_2331200153_Lab6.Factory_Method_Pattern;

import java.time.LocalDate;
public class HighPriorityRequest extends MaintenanceRequest {
    public HighPriorityRequest(String description) {
        super(description);
        setPriority("Emergency");
        setStatus("Accept");
        setExpire(LocalDate.now());
    }

    @Override
    public void process() {
        System.out.println("Emergency request, our Administer will contact you immediately!");
    }
}