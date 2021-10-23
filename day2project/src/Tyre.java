public class Tyre {
    private String tyreName;
    private float tyreSize;

    public Tyre(String tyreName, float tyreSize) {
        this.tyreName = tyreName;
        this.tyreSize = tyreSize;
    }

    public String getTyreName() {
        return tyreName;
    }

    public void setTyreName(String tyreName) {
        this.tyreName = tyreName;
    }

    public float getTyreSize() {
        return tyreSize;
    }

    public void setTyreSize(float tyreSize) {
        this.tyreSize = tyreSize;
    }
}
