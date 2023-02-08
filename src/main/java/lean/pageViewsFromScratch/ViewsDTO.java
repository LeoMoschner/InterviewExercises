package lean.pageViewsFromScratch;

public class ViewsDTO {
    private int pageViews;
    private int uniques;

    public ViewsDTO(int pageViews, int uniques) {
        this.pageViews = pageViews;
        this.uniques = uniques;
    }

    public int getPageViews() {
        return pageViews;
    }

    public void setPageViews(int pageViews) {
        this.pageViews = pageViews;
    }

    public int getUniques() {
        return uniques;
    }

    public void setUniques(int uniques) {
        this.uniques = uniques;
    }

    @Override
    public String toString() {
        return "{" +
                "pageViews=" + pageViews +
                ", uniques=" + uniques +
                '}';
    }
}
