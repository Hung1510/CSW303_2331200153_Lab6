package CSW303_2331200153_Lab6.Factory_Method_Pattern;

import java.time.LocalDate;
public abstract class MaintenanceRequest {
    protected String description;
    protected String priority;
    protected String status;
    protected LocalDate expire;

    public MaintenanceRequest(String description) {
        this.description = description;
    }

    public abstract void process();

    public String getDescription() {
        return description;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setExpire(LocalDate expire) {
        this.expire = expire;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getExpire() {
        return expire;
    }
}