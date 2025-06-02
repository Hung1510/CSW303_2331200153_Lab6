package CSW303_2331200153_Lab6.Factory_Method_Pattern;

import java.time.LocalDate;

public class MediumPriorityRequest extends MaintenanceRequest {
    public void setPriority() {
        this.priority = "Medium";
    }

    public void setStatus() {
        this.status = "Accepted";
    }

    public void setExpire() {
        this.expire = LocalDate.now().plusMonths(1);
    }

    public void processRequest() {
        System.out.println("Request accept, estimated completion date is " + expire);
    }
}
