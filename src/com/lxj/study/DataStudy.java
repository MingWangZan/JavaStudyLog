package com.lxj.study;

import com.lxj.study.utils.TestUtils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;

public class DataStudy {
    public static void main(String[] args) throws InterruptedException {
        TestUtils testUtils = new TestUtils("李祥杰", 18);
        String res = testUtils.toString();
        System.out.println(res);

        Executors.newSingleThreadScheduledExecutor();
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("+8"));
        System.out.println(localDateTime);
        LocalDateTime localDate = localDateTime.plusDays(1);
        System.out.println(localDate);


        Date date = new Date();

//        new Timer().schedule(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("退出");
//                this.cancel();
//            }
//        }, 100);
//
//        Thread.sleep(3000);

        Date date1 = new Date();

        boolean res1 = date.after(new Date());
        boolean res2 = date1.after(date);

        System.out.println(date);
        System.out.println(date1);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(date.after(date1));
        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date));
        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date1));

        double[] r = {1.1, 2.2, 3.3, 7.7};
        printMax(5.5);
        printMax(5.5, 6.6, 7.7, 8.8);
        printMax(r);

    }

    public static void printMax(double... number) {
        if (number.length == 0) {
            System.out.println("空");
            return;
        }

        double result = number[0];
        for (int i = 1;i < number.length; i++) {
            if (number[i] > result) {
                result = number[i];
            }
        }
        System.out.println("sss" + result);
    }
}
