package Lean.ViewsDenisTheTank;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

import static Lean.ViewsDenisTheTank.InputClassJava.generateDataInMapFormat;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getViews());
    }

    public static long getViews(){
        Map<String, DateEntry> dataMap = generateDataInMapFormat();
        long views = 0;
        int amountOfDays = 7;
        LocalDate validDate = LocalDate.now().minusDays(amountOfDays + 1);
        for (Map.Entry<String, DateEntry> entry: dataMap.entrySet()){
            LocalDate date = LocalDate.parse(entry.getKey());
            if (date.isAfter(validDate)){
                DateEntry aux = entry.getValue();
                views += aux.ios.pageViews;
                views += aux.android.pageViews;
                views += aux.mobile_web.pageViews;
                views += aux.new_reddit.pageViews;
                views += aux.old_reddit.pageViews;
            }
        }
        return views;
    }

}
