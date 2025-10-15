public class CloudServicePlatform {
    private CloudPlatform platform;

    public CloudServicePlatform(CloudPlatform platform) {
        this.platform = platform;
    }

    public void hostingTo(AppWeb app) {
        platform.connect(app);
    }
}

// Está abierta a modificación cada vez que se añade una nueva plataforma.
