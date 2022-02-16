package com.lxj.study.project;

public class ListTest {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        ChangeIt1.doIt(myArray);  // 传递给程序的是 数组 myArray 的引用
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("myArray[%d] = %d\n", i, myArray[i]);
        }
    }
}

class ChangeIt1 {
    static void doIt(int[] z) {
        z[1] = 99;
    }
}