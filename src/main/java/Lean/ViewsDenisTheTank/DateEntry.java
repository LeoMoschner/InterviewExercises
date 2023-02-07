package Lean.ViewsDenisTheTank;


public class DateEntry {
    Lean.ViewsDenisTheTank.PageViewAndUniquesDataObject android;
    PageViewAndUniquesDataObject ios;
    PageViewAndUniquesDataObject mobile_web;
    PageViewAndUniquesDataObject new_reddit;
    PageViewAndUniquesDataObject old_reddit;

    @Override
    public String toString() {
        return "DateEntrys{" +
                "android=" + android +
                ", ios=" + ios +
                ", mobile_web=" + mobile_web +
                ", new_reddit=" + new_reddit +
                ", old_reddit=" + old_reddit +
                '}';
    }
}