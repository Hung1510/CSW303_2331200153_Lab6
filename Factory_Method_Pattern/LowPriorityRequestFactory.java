package CSW303_2331200153_Lab6.Factory_Method_Pattern;
public class LowPriorityRequestFactory extends MaintenanceRequestFactory {
    @Override
    public MaintenanceRequest createRequest(String description) {
        return new LowPriorityRequest(description);
    }
}
