public class CloudServicePlatform implements ICloudService {
    private final CloudService cloudService;

    public CloudServicePlatform(CloudService cloudService) {
        this.cloudService = cloudService;
    }

    public void connect(AppWeb app) {
        cloudService.connect(app);
    }

    // More Methods
}
// Se estaba violando el Open Closed Principle

