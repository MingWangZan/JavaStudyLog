package com.lxj.study;

public class GirlFriend extends Friend {
    private String place;
    private String hobby;
    private String call;

    public GirlFriend(String name, int age, int height, float weight) {
        super(name, age, height, weight);
    }

    public GirlFriend(String hobby) {
        this.hobby = hobby;
    }

    public GirlFriend(String name, int age, int height, float weight, String call) {
        super(name, age, height, weight);
        this.call = call;
    }

    public GirlFriend(String name, int age, int height, float weight, String place, String hobby, String call) {
        super(name, age, height, weight);
        this.place = place;
        this.hobby = hobby;
        this.call = call;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "place='" + place + '\'' +
                ", hobby='" + hobby + '\'' +
                ", call=" + call +
                '}';
    }

    @Override
    public void sleep() {
        System.out.println("先洗脚再睡觉");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("吃的很少");
    }

    @Override
    public void introduction() {
        super.introduction();
        System.out.println("我是 *** 的女朋友");
    }
}
