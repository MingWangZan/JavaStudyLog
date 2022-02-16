package com.lxj.study;

import java.util.Locale;

import static java.lang.String.copyValueOf;

public class StringStudy {
    public static void main(String[] args) {
        String str1 = "Hello World! We can be engineers!";
        String str2 = "Never give up!";
//        String site = "blog.xiangjieli.com";
//        String result = site.concat(":8080");
//        System.out.println(result);
//
//        Number a = 555.0;
//        var s = Math.random();
//        System.out.println("结果为：" + s);

        /**
         * 实例化一个 String 变量，使用 new 关键字，声明变量内容 将会放到 堆 中。
         */
//        System.out.println("===============================================");
//        char[] helloArray = { 'h', 'e', 'l', 'l', 'o'};
//        String res = new String(helloArray);
//        System.out.println(res);
//        System.out.println("===============================================");

        /**
         * 返回字符串的长度
         */
//        System.out.println("==================String.lenght====================");
//        String str = "HelloWorld";
//        System.out.println(str.length());
//        System.out.println("===================================================");
//
        /**
         * 连接字符串
         */
//        System.out.println("==================String.concat====================");
//        String str1 = "测试";
//        String str2 = str1.concat("成功 Success");
//        System.out.println(str2);
//        System.out.println("===================================================");
//
        /**
         * 返回 索引处的 char 的值， 参数 int 类型
         */
//        System.out.println("================返回索引处的 char ==================");
//        String str3 = "a";
//        char char1 = str3.charAt(15);
//        System.out.println(char1);
//        System.out.println("======================================================");

        /**
         * 按字典顺序比较 两个 字符串
         */
//        System.out.println("=================================================");
//        String str4 = "a";
//        int i = str4.compareTo(str3);
//        System.out.println(i);
//        System.out.println("=================================================");

        /**
         * 判断 StringBuffer 顺序是否和 String 字符串顺序相同！ 返回 布尔值。 当两边完全相同时，则返回 true
         */
//        System.out.println("===================================");
        String str3 = "Hello World! We can trust it!";
//        boolean bool = str3.contentEquals(new StringBuffer("Hello World! We can trust it!"));
//        System.out.println(bool);
//        System.out.println("===================================");

        /**
         * 返回 char 数组系列化后的字符串
         */
//        System.out.println("======================================");
//        char[] charArray = str1.toCharArray();
//        for (char c : charArray) {
//            System.out.println(c);
//        }
//        String staticString = copyValueOf(charArray, 13, 16);
//        System.out.println(staticString);
//        System.out.println("======================================");

        /**
         * 字符串是否以 * 结束
         */
//        System.out.println("=======================================");
//        System.out.println(str1.endsWith("it!"));
//        System.out.println("=======================================");

        /**
         *  字符串比较  不考虑大小
         */
//        System.out.println("=======================================");
//        System.out.println(str1.equalsIgnoreCase("hEllo WorLd! We cAn trust it!"));
//        System.out.println("=======================================");

        /**
         * 返回字符串的 哈希码
         */
//        int result = "aa".hashCode();
//        System.out.println(result);

        /**
         * 指定字符在此字符串中第一次出现处的索引
         */
//        System.out.println(str1);
//        int result1 = str1.indexOf("can");
////        String[] res1 = str1.split(" ");
//        String res1 = str1.substring(result1, result1 + 6);
//        int result2 = str1.indexOf('e');
//        int result4 = str1.indexOf('e',result1);
//        String res4 = str1.substring(result4);
//        int result5 = str1.indexOf('e', 2);
//        String res5 = str1.substring(result5);
//        int result6 = str1.lastIndexOf('e', 27);
//        String res6 = str1.substring(result6);
//        System.out.println(result1);
//        System.out.println(res1);
//        System.out.println(result2);
//        System.out.println(result4);
//        System.out.println(res4);
//        System.out.println(result5);
//        System.out.println(res5);
//        System.out.println(result6);
//        System.out.println(res6);

        /**
         * 字符串大小写转换
         */
//        System.out.println(str1.toLowerCase());
//        System.out.println(str2.toLowerCase(Locale.ROOT));
//        System.out.println(str1.toUpperCase());
//        System.out.println(str2.toUpperCase(Locale.ROOT));

        /**
         * 字符串判空
         */
//        String a = "";
//        System.out.println(str1.isEmpty() ? " 为空": "不为空");
//        System.out.println(str1.isBlank() ? "为空" : "不为空");
//        System.out.println(a.isEmpty() ? "为空" : "不为空");
//        System.out.println(a.isBlank() ? "为空" : "不为空");
//        String b = " ";
//        System.out.println(b.isEmpty() ? "空" : "非空");
//        System.out.println(b.isBlank() ? "空" : "非空");

        CharSequence charSequence = str1.subSequence(0, 5);
        String res1 = str1.substring(0, 5);
        System.out.println(charSequence);
        System.out.println(res1);
        System.out.println(charSequence == res1 ? "相同" : "不相同");
    }
}
