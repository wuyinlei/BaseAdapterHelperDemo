package com.example.baseadapterhelperdemo.adapter;

import com.example.baseadapterhelperdemo.R;
import com.example.baseadapterhelperdemo.bean.User;

import java.util.List;

/**
 * Created by 若兰 on 2016/2/13.
 * 一个懂得了编程乐趣的小白，希望自己
 * 能够在这个道路上走的很远，也希望自己学习到的
 * 知识可以帮助更多的人,分享就是学习的一种乐趣
 * QQ:1069584784
 * csdn:http://blog.csdn.net/wuyinlei
 */

public class MyAdapter extends CommentAdapter<User> {
    /**
     * 这里构造函数，传入数据的list和布局
     *
     * @param TList
     * @param layoutId
     */
    public MyAdapter(List<User> TList, int layoutId) {
        super(TList, R.layout.item);
    }

    /**
     * 这个我们使用的时候直接传入数据即可
     * @param list
     */
    public MyAdapter(List<User> list){
        super(list,R.layout.item);
    }


    @Override
    public void convert(CommentViewHolder holder, User user) {

        //在这里我们直接绑定数据就行了，是不是少了很多的重复的代码呢
        holder.setText(R.id.tvName,user.getName());
        holder.setText(R.id.tvSex,user.getSex());
    }
}
