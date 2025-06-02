package CSW303_2331200153_Lab6.Factory_Method_Pattern;
public class MaintenanceRequestDemo {
    public static void main(String[] args) {
        MaintenanceRequestFactory lowFactory = new LowPriorityRequestFactory();
        MaintenanceRequest lowRequest = lowFactory.createRequest("Fix dripping faucet in room 101.");
        lowRequest.process();

        MaintenanceRequestFactory mediumFactory = new MediumPriorityRequestFactory();
        MaintenanceRequest mediumRequest = mediumFactory.createRequest("Air conditioner not working in room 205.");
        mediumRequest.process();

        MaintenanceRequestFactory highFactory = new HighPriorityRequestFactory();
        MaintenanceRequest highRequest = highFactory.createRequest("Electrical short circuit in main hall.");
        highRequest.process();
    }
}