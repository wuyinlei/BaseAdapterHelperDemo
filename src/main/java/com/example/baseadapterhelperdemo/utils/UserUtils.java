package com.example.baseadapterhelperdemo.utils;

import com.example.baseadapterhelperdemo.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 若兰 on 2016/2/13.
 * 一个懂得了编程乐趣的小白，希望自己
 * 能够在这个道路上走的很远，也希望自己学习到的
 * 知识可以帮助更多的人,分享就是学习的一种乐趣
 * QQ:1069584784
 * csdn:http://blog.csdn.net/wuyinlei
 */

public class UserUtils {


    public static List<User> getUserUtils() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            String name = "小明" + i;
            String sex = "男";
            if (i % 2 == 0) {
                sex = "女";
            }
            User u = new User(name, sex);
            users.add(u);
        }

        return users;
    }
}
