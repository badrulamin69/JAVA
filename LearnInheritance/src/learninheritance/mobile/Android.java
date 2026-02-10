
package learninheritance.mobile;

public class Android extends Mobile{
    
    private String touchScreen;
    private String brower;
    private String playStore;
    private String setOs;

    public Android() {
    }
    
    

    public Android(String touchScreen, String brower, String playStore, String setOs) {
        this.touchScreen = touchScreen;
        this.brower = brower;
        this.playStore = playStore;
        this.setOs = setOs;
    }

    public String getTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(String touchScreen) {
        this.touchScreen = touchScreen;
    }

    public String getBrower() {
        return brower;
    }

    public void setBrower(String brower) {
        this.brower = brower;
    }

    public String getPlayStore() {
        return playStore;
    }

    public void setPlayStore(String playStore) {
        this.playStore = playStore;
    }

    public String getSetOs() {
        return setOs;
    }

    public void setSetOs(String setOs) {
        this.setOs = setOs;
    }
    
    
    
    
}
