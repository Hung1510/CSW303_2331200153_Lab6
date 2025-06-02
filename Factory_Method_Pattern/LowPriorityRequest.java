package CSW303_2331200153_Lab6.Factory_Method_Pattern;

import java.time.LocalDate;
public class LowPriorityRequest extends MaintenanceRequest {
    public LowPriorityRequest(String description) {
        super(description);
        setPriority("Ignore");
        setStatus("Done");
        setExpire(LocalDate.now());
    }

    @Override
    public void process() {
        System.out.println("Request denied");
    }
}