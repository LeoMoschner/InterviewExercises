package lean.pageViewsDoneInInterview;

public class PlatformDTO {
    private ViewsDTO android;
    private ViewsDTO iOS;
    private ViewsDTO mobileWeb;
    private ViewsDTO oldReddit;
    private ViewsDTO newReddit;

    public ViewsDTO getAndroid() {
        return android;
    }

    public void setAndroid(ViewsDTO android) {
        this.android = android;
    }

    public ViewsDTO getiOS() {
        return iOS;
    }

    public void setiOS(ViewsDTO iOS) {
        this.iOS = iOS;
    }

    public ViewsDTO getMobileWeb() {
        return mobileWeb;
    }

    public void setMobileWeb(ViewsDTO mobileWeb) {
        this.mobileWeb = mobileWeb;
    }

    public ViewsDTO getOldReddit() {
        return oldReddit;
    }

    public void setOldReddit(ViewsDTO oldReddit) {
        this.oldReddit = oldReddit;
    }

    public ViewsDTO getNewReddit() {
        return newReddit;
    }

    public void setNewReddit(ViewsDTO newReddit) {
        this.newReddit = newReddit;
    }
}
