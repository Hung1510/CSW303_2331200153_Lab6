package CSW303_2331200153_Lab6.Factory_Method_Pattern;

import java.time.LocalDate;

 class LowPriorityRequest extends MaintenanceRequest
{

    public void setPriority() {
        this.priority = "Ignore";
    }

    public void setStatus() {
        this.status = "Done";
    }

    public void setExpire() {
        this.expire = LocalDate.now();
    }

    public void processRequest() {
        System.out.println("Request denied");
    }
}
