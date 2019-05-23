package huang.smart.spring.learning;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * function description
 *
 * @author huangchaoguang
 * @date 2019/5/20 15:59
 */
public class ArrayListTest {

    public static void main(String[] args) {
//        List<Object> array = new ArrayList<>();
//        array.add(null);
//        array.add(null);
//        array.add(null);
//        System.out.println(array.size());
//
//
//        String lala = "{\"baiduShopId\":\"2267053391\",\"businessStatus\":\"3\",\"businessTime\":[{\"end\":\"22:00:00\",\"start\":\"05:00:00\"}],\"deliveryRegion\":[{\"deliveryFee\":\"0\",\"deliveryTime\":\"0\",\"minBuyFree\":\"0\",\"minOrderPrice\":\"0\",\"name\":\"区域1\",\"region\":[{\"latitude\":40.049587,\"longitude\":116.31796},{\"latitude\":40.048835,\"longitude\":116.311241},{\"latitude\":40.04364,\"longitude\":116.309192},{\"latitude\":40.039843,\"longitude\":116.315742},{\"latitude\":40.042216,\"longitude\":116.324488}]}],\"invoiceSupport\":1,\"ivrPhone\":\"010-59921111\",\"packageBoxPrice\":0,\"phone\":\"18888888888\",\"servicePhone\":\"400-852-7777\",\"servicePhoneBak\":\"400-852-7777\",\"shopId\":\"666123\",\"stationId\":\"36\"}";
//        System.out.println(lala);
        System.out.println(formatHHMM("12:12"));
        System.out.println(formatHHMM("1:11"));
        System.out.println(formatHHMM("11:1"));
        System.out.println(formatHHMM("1:1"));

        System.out.println(formatHHMM("12:12:1"));
        System.out.println(formatHHMM("1:11:1"));
        System.out.println(formatHHMM("11:1:1"));
        System.out.println(formatHHMM("1:1:1"));
    }

    private static String formatHHMM(String time) {
        if (!StringUtils.isEmpty(time) && time.lastIndexOf(":") >= 3) {
            return time.substring(0, time.lastIndexOf(":"));
        }
        return time;
    }
}
