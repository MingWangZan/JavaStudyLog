package com.lxj.study;

public class Friend {
    private String name;
    private int age;
    private int height;
    private float weight;

    public Friend() {
    }

    public Friend(String name) {
        this.name = name;
    }

    public Friend(int age) {
        this.age = age;
    }

    public Friend(float weight) {
        this.weight = weight;
    }

    public Friend(String name, int age, int height, float weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public void eat() {
        System.out.println("正在吃饭");
    }

    public void sleep() {
        System.out.println("正在睡觉");
    }

    public void introduction() {
        System.out.println("大家好！我是" + name);
    }
}
