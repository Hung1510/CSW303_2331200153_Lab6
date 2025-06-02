package CSW303_2331200153_Lab6.Factory_Method_Pattern;

import java.time.LocalDate;
public class MediumPriorityRequest extends MaintenanceRequest {
    public MediumPriorityRequest(String description) {
        super(description);
        setPriority("Medium");
        setStatus("Accepted");
        setExpire(LocalDate.now().plusMonths(1));
    }

    @Override
    public void process() {
        System.out.println("Request accept, estimated completion date is " + expire);
    }
}