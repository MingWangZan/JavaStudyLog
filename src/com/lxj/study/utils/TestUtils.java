package com.lxj.study.utils;

public class TestUtils {
    private String name;
    private int age;

    public TestUtils() {
    }

    public TestUtils(int age) {
        this.age = age;
    }

    public TestUtils(String name) {
        this.name = name;
    }

    public TestUtils(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestUtils{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("此时方法被调用了！");
    }
}
