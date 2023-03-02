package com.langjia.git;

import java.util.Random;

public class GitTest {
    public static void main(String[] args) {
        //1，用随机生成数方法，生成验证码
        Random random = new Random();    //定义一个随机生成数技术，用来生成随机数
        //定义一个可变长字符串StringBuilder用来接收生成的验证码
        StringBuilder stringBuilder = new StringBuilder();
        int a = random.nextInt(5);//用来随机生成一个数来确定唯一的字母在哪个位置
        for (int i = 0; i < 5; i++) {  //循环5次每次生成一位，5位验证码
            if (i==a){//两者相等说明这一位置为字母
                int b = random.nextInt(2);//随机生产0或1
                char s;
                if (b==0){//0为小写
                    s=(char)(random.nextInt(26)+97);
                }else {//1为大写
                    s=(char)(random.nextInt(26)+65);
                }
                stringBuilder.append(s);//添加的可变长字符串中
                continue;//跳过本次循环
            }
            int s1= random.nextInt(10);//随机生成0-9的一个数字
            stringBuilder.append(s1);//添加的可变长字符串中
        }
        String string = stringBuilder.toString();//将可变长字符串转化为字符串
        System.out.println("用随机生成数方法，生成的验证码:"+string);
    }
}
