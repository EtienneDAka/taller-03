public class CloudServicePlatform {
    private CloudPlatform platform;

    public CloudServicePlatform(CloudPlatform platform) {
        this.platform = platform;
    }

    public void hostingTo(AppWeb app) {
        platform.connect(app);
    }
}
// Se estaba violando el Open Closed Principle

// Está abierta a modificación cada vez que se añade una nueva plataforma.
