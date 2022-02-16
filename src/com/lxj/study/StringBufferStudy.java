package com.lxj.study;

public class StringBufferStudy {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder(5);
//        sb.append("Hello");
//
//        System.out.println(sb);
//
//        sb.insert(5, "Java");
//        System.out.println(sb);
//
//        sb.insert(3, "中间插入");
//        System.out.println(sb);
//
//        sb.delete(5, 8);
//        System.out.println(sb);

        StringBuffer stringBuffer = new StringBuffer("测试：");
        stringBuffer.append(' ');
        stringBuffer.append("http://");
        stringBuffer.append("www");
        stringBuffer.append(".xiangjieli");
        stringBuffer.append(".com");
        System.out.println(stringBuffer);

        stringBuffer.replace(6, 15, "今天是个好日子");
        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);

        System.out.println("===========================");
        System.out.printf("当前 stringBuffer 容量：%d\n",stringBuffer.capacity());
        stringBuffer.ensureCapacity(500);
        System.out.printf("设置最小容量后的容量：%d\n", stringBuffer.capacity());
        stringBuffer = new StringBuffer("sss");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.capacity()); // new StringBuffer 默认长度为 字符串长度 + 16
    }
}
