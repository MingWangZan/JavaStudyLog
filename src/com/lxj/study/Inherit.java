package com.lxj.study;

public class Inherit {
    public static void main(String[] args) {
        Friend friend = new Friend("李祥杰",23, 175, 130);
        GirlFriend girlFriend = new GirlFriend("***", 21, 160, 150, "***", "", "5");

        friend.introduction();
        friend.eat();
        friend.sleep();

        girlFriend.introduction();
        girlFriend.eat();
        girlFriend.sleep();
    }
}
