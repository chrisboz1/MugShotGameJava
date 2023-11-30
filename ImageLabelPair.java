package game;

public class ImageLabelPair {
    private String imagePath;
    private String label;

    public ImageLabelPair(String imagePath, String label) {
        this.imagePath = imagePath;
        this.label = label;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getLabel() {
        return label;
    }
}
