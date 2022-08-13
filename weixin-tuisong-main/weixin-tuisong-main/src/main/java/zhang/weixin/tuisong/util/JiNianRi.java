package zhang.weixin.tuisong.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @ClassName JiNianRi
 * @Description TODO
 * @Author 张辉
 * @Date 2022/8/2 17:32
 */
public class JiNianRi {
    /**
     * 恋爱
     */
    static String lianAi = "2022-03-09 10:06:00";
//    /**
//     * 领证
//     */
//    static String linZheng = "2022-03-19";
//    /**
//     * 结婚
//     */
//    static String jieHun = "2022-07-08";
    /**
     * 生日
     */
    static String shengRi = "2023-08-22 00:00:00";

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 距离date还有多少天
     * @param date
     * @return
     */
    public static String  before(String date) {
        long day = 0;
        try {
            long nd = 1000 * 24 * 60 * 60;
            // 获得两个时间的毫秒时间差异
            long diff = simpleDateFormat.parse(date).getTime() -  System.currentTimeMillis();
            // 计算差多少天
            day = diff / nd;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String newDay = String.valueOf(day).replace("-","");
        return newDay;
    }


    /**
     * 已经过去date多少天
     * @param date
     * @return
     */
    public static String after(String date) {
        long day = 0;
        try {
            long nd = 1000 * 24 * 60 * 60;
            // 获得两个时间的毫秒时间差异
            long diff =  System.currentTimeMillis() - simpleDateFormat.parse(date).getTime();
            // 计算差多少天
            day = diff / nd;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String newDay = String.valueOf(day).replace("-","");
        return newDay;
    }

//    public static int getJieHun() {
//        return before(jieHun);
//    }
//
//    public static int getLinZhen() {
//        return before(linZheng);
//    }

    public static String getLianAi() {
        return before(lianAi);
    }

    public static String getShengRi(){
        return after(shengRi);
    }

//    public static void main(String[] args) {
//        System.out.println(getJieHun());
//    }


}
