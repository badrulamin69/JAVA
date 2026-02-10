
package learninheritance.mobile;

public class Apple extends Mobile{
    
    private String facecall;
    private String appstore;
    private String imessage;

    public Apple(String facecall, String appstore, String imessage) {
        this.facecall = facecall;
        this.appstore = appstore;
        this.imessage = imessage;
    }

    public String getFacecall() {
        return facecall;
    }

    public void setFacecall(String facecall) {
        this.facecall = facecall;
    }

    public String getAppstore() {
        return appstore;
    }

    public void setAppstore(String appstore) {
        this.appstore = appstore;
    }

    public String getImessage() {
        return imessage;
    }

    public void setImessage(String imessage) {
        this.imessage = imessage;
    }
    
    
      
}
