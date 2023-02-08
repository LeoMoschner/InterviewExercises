package lean.pageViewsFromScratch;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Call generateDataInMapFormat to get input data, it is a map with key as date and value
 * is DateEntry. Each entry represents this json object:
 *
 * "2020-01-20": {
 *             "android": {
 *               "pageviews": 1048749,
 *               "uniques": 283306
 *             },
 *             "ios": {
 *               "pageviews": 828792,
 *               "uniques": 390098
 *             },
 *             "mobile_web": {
 *               "pageviews": 184459,
 *               "uniques": 115771
 *             },
 *             "new_reddit": {
 *               "pageviews": 398615,
 *               "uniques": 233145
 *             },
 *             "old_reddit": {
 *               "pageviews": 907138,
 *               "uniques": 196448
 *             }
 *           }
 *
 * @return
 */
public class Solution {
    /**
     * Las page views de los ultimos 7 dias por plataforma
     *
     * Last week:
     *         Android = X
     *         ios = X
     *         etc....
     *
     *
     * */
    public static void main(String[] args) {
        Map<String, PlatformDTO> restoredData = LoadInput.getFormattedMap();
        int days = 7;
        System.out.println(solution(restoredData, days));
    }

    public static Map<String, Integer> solution(Map<String, PlatformDTO> restoredData, int lastDays){
        Map<String, Integer> result = new HashMap<>(Map.of("android", 0, "iOS", 0, "mobileWeb", 0, "newReddit", 0, "oldReddit", 0));
        LocalDate validDate = LocalDate.now().minusDays(lastDays + 1);
        for (Map.Entry<String, PlatformDTO> entry: restoredData.entrySet()){
            LocalDate dateToCheck = LocalDate.parse(entry.getKey());
            if (dateToCheck.isAfter(validDate)){
                PlatformDTO value = entry.getValue();
                result.put("android", result.get("android") + value.getAndroid().getPageViews());
                result.put("iOS", result.get("iOS") + value.getIos().getPageViews());
                result.put("mobileWeb", result.get("mobileWeb") + value.getMobileWeb().getPageViews());
                result.put("newReddit", result.get("newReddit") + value.getNewReddit().getPageViews());
                result.put("oldReddit", result.get("oldReddit") + value.getOldReddit().getPageViews());
            }
        }
        System.out.println("Page views for each platform of the last " + lastDays + " days:");
        return result;
    }

}
