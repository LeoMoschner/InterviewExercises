package lean.pageViewsDoneInInterview;

public class ViewsDTO {
    private long pageViews;
    private long uniques;

    public ViewsDTO(long pageViews, long uniques) {
        this.pageViews = pageViews;
        this.uniques = uniques;
    }

    public long getPageViews() {
        return pageViews;
    }

    public void setPageViews(long pageViews) {
        this.pageViews = pageViews;
    }

    public long getUniques() {
        return uniques;
    }

    public void setUniques(long uniques) {
        this.uniques = uniques;
    }

}
