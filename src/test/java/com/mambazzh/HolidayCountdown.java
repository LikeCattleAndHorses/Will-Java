package com.mambazzh;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 【摸鱼办】提醒您：11月17日早上好，摸鱼人！工作再累，一定不要忘记摸鱼哦！有事没事起身去茶水间，去厕所，去廊道走走别老在工位上坐着，钱是老板的,但命是自己的
 * 距离周末还有:2天
 * 距离元旦还有:44天
 * 距离春节还有:74天
 * 距离清明节还有:136天
 * 距离劳动节还有:164天
 * 距离端午节还有:198天
 * 距离中秋节还有:297天
 * 距离国庆节还有:318天
 * 上班是帮老板赚钱，摸鱼是赚老板的钱！最后，祝愿天下所有摸鱼人，都能愉快的渡过每一天…
 */
public class HolidayCountdown {
    //  春节时间
    private static final String SPRING_FESTIVAL = "2022-01-31 00:00:00";
    //  清明节时间 4月3号 开始放假
    private static final String QING_MING_FESTIVAL = "2022-04-03 00:00:00";
    //  劳动节时间 4月30号 开始放假
    private static final String LABOR_DAY = "2022-04-30 00:00:00";
    //  端午节时间
    private static final String DRAGON_BOAT_FESTIVAL = "2022-06-03 00:00:00";
    //  中秋节时间
    private static final String MID_AUTUMN_FESTIVAL = "2022-09-10 00:00:00";
    //  国庆节时间
    private static final String NATIONAL_FESTIVAL = "2022-10-01 00:00:00";


    public static void main(String[] args) {
        Map<Object, String> dayMap = new HashMap<>();
        dayMap.put(1, "一");
        dayMap.put(2, "二");
        dayMap.put(3, "三");
        dayMap.put(4, "四");
        dayMap.put(5, "五");
        dayMap.put(6, "六");
        dayMap.put(7, "日");
        Date date = new Date();
        String today = DateUtil.format(date, "yyyy-MM-dd");
        int i = DateUtil.dayOfWeek(date) - 1;
        System.out.println("【摸鱼办】提醒您：");
        System.out.println("        早上好，摸鱼人！今天是" + today + "【星期" + dayMap.get(i) + "】工作再累，一定不要忘记摸鱼哦！");
        System.out.println("有事没事起身去茶水间，去厕所，外面走走别老在工位上坐着，钱是老板的, 但命是自己的！");

        //  周末倒计时
        weekendCountdown(i);

        //  元旦倒计时
        newYearCountdown(date);

        //  春节倒计时
        springFestivalCountdown(date);

        //  清明节
        qingMingFestivalCountdown(date);

        //  劳动节
        laborDayCountdown(date);

        //  端午节
        dragonBoatFestivalCountdown(date);

        //  中秋节
        midAutumnFestivalCountdown(date);

        //  国庆节
        nationalFestivalCountdown(date);

        System.out.println("上班是帮老板赚钱，摸鱼是赚老板的钱！最后，祝愿天下所有摸鱼人，都能愉快的渡过每一天......");

    }

    /**
     * 周末倒计时
     *
     * @param i
     */
    public static void weekendCountdown(int i) {
        //  周末倒计时
        int j = 6 - i;
        if (j == 0 || j == -1) {
            j = 0;
        }
        System.out.println("距离周末还有：" + j + "天");
    }

    /**
     * 元旦倒计时
     *
     * @param date
     */
    public static void newYearCountdown(Date date) {
        //  获取明年1月1号
        int nextYear = DateUtil.year(date) + 1;
        DateTime nextYearInit = DateUtil.parse(nextYear + "-01-01 00:00:00");
        //  （明年1月1号 - 当前日期）/ 一天的毫秒数
        long newYearCountdown = (nextYearInit.getTime() - date.getTime()) / (24 * 60 * 60 * 1000);
        System.out.println("距离元旦放假还有：" + newYearCountdown + "天");
    }

    /**
     * 春节倒计时
     *
     * @param date
     */
    public static void springFestivalCountdown(Date date) {
        DateTime springFestivalInit = DateUtil.parse(SPRING_FESTIVAL);
        System.out.println("距离春节放假还有：" + (springFestivalInit.getTime() - date.getTime()) / (24 * 60 * 60 * 1000) + "天");
    }

    /**
     * 清明节倒计时
     *
     * @param date
     */
    public static void qingMingFestivalCountdown(Date date) {
        DateTime springFestivalInit = DateUtil.parse(QING_MING_FESTIVAL);
        System.out.println("距离清明节放假还有：" + (springFestivalInit.getTime() - date.getTime()) / (24 * 60 * 60 * 1000) + "天");
    }

    /**
     * 劳动节倒计时
     *
     * @param date
     */
    public static void laborDayCountdown(Date date) {
        DateTime springFestivalInit = DateUtil.parse(LABOR_DAY);
        System.out.println("距离劳动节放假还有：" + (springFestivalInit.getTime() - date.getTime()) / (24 * 60 * 60 * 1000) + "天");
    }

    /**
     * 端午节倒计时
     *
     * @param date
     */
    public static void dragonBoatFestivalCountdown(Date date) {
        DateTime springFestivalInit = DateUtil.parse(DRAGON_BOAT_FESTIVAL);
        System.out.println("距离端午节放假还有：" + (springFestivalInit.getTime() - date.getTime()) / (24 * 60 * 60 * 1000) + "天");
    }

    /**
     * 中秋节倒计时
     *
     * @param date
     */
    public static void midAutumnFestivalCountdown(Date date) {
        DateTime springFestivalInit = DateUtil.parse(MID_AUTUMN_FESTIVAL);
        System.out.println("距离中秋节放假还有：" + (springFestivalInit.getTime() - date.getTime()) / (24 * 60 * 60 * 1000) + "天");
    }


    /**
     * 国庆节倒计时
     *
     * @param date
     */
    public static void nationalFestivalCountdown(Date date) {
        DateTime springFestivalInit = DateUtil.parse(NATIONAL_FESTIVAL);
        System.out.println("距离国庆节放假还有：" + (springFestivalInit.getTime() - date.getTime()) / (24 * 60 * 60 * 1000) + "天");
    }
}
