
package learninheritance.mobile;

public class FeaturePhone extends Android{
    
    private String button;

    public FeaturePhone(String touchScreen, String brower, String playStore, String setOs) {
        super(touchScreen, brower, playStore, setOs);
    }

    public FeaturePhone(String button, String touchScreen, String brower, String playStore, String setOs) {
        super(touchScreen, brower, playStore, setOs);
        this.button = button;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }
    
    
    
}
