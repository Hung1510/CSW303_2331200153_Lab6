package CSW303_2331200153_Lab6.Factory_Method_Pattern;

import java.time.LocalDate;

abstract class MaintenanceRequest {
    protected String priority;
    protected String status;
    protected LocalDate expire;

    public abstract void setPriority();
    public abstract void setStatus();
    public abstract void setExpire();
    public abstract void processRequest();
}
