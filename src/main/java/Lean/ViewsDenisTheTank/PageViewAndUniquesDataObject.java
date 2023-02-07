package Lean.ViewsDenisTheTank;

public class PageViewAndUniquesDataObject {
    public final int pageViews;
    public final int uniques;

    public PageViewAndUniquesDataObject(int pageviews, int uniques) {
        this.pageViews = pageviews;
        this.uniques = uniques;
    }

    @Override
    public String toString() {
        return "BaseClasss{" +
                "pageViews=" + pageViews +
                ", uniques=" + uniques +
                '}';
    }
}
