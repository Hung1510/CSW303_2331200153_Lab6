package CSW303_2331200153_Lab6.Factory_Method_Pattern;

import java.time.LocalDate;

public class HighPriorityRequest extends MaintenanceRequest {
    public void setPriority() {
        this.priority = "Emergency";
    }

    public void setStatus() {
        this.status = "Accept";
    }

    public void setExpire() {
        this.expire = LocalDate.now();
    }

    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately !");
    }
}
