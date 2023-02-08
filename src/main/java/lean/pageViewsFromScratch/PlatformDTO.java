package lean.pageViewsFromScratch;

public class PlatformDTO {
    private ViewsDTO android;
    private ViewsDTO ios;
    private ViewsDTO mobileWeb;
    private ViewsDTO newReddit;
    private ViewsDTO oldReddit;

    public ViewsDTO getAndroid() {
        return android;
    }

    public void setAndroid(ViewsDTO android) {
        this.android = android;
    }

    public ViewsDTO getIos() {
        return ios;
    }

    public void setIos(ViewsDTO ios) {
        this.ios = ios;
    }

    public ViewsDTO getMobileWeb() {
        return mobileWeb;
    }

    public void setMobileWeb(ViewsDTO mobileWeb) {
        this.mobileWeb = mobileWeb;
    }

    public ViewsDTO getNewReddit() {
        return newReddit;
    }

    public void setNewReddit(ViewsDTO newReddit) {
        this.newReddit = newReddit;
    }

    public ViewsDTO getOldReddit() {
        return oldReddit;
    }

    public void setOldReddit(ViewsDTO oldReddit) {
        this.oldReddit = oldReddit;
    }

    @Override
    public String toString() {
        return "{" +
                "android=" + android +
                ", ios=" + ios +
                ", mobileWeb=" + mobileWeb +
                ", newReddit=" + newReddit +
                ", oldReddit=" + oldReddit +
                '}';
    }
}
