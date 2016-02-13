package com.example.baseadapterhelperdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by 若兰 on 2016/2/13.
 * 一个懂得了编程乐趣的小白，希望自己
 * 能够在这个道路上走的很远，也希望自己学习到的
 * 知识可以帮助更多的人,分享就是学习的一种乐趣
 * QQ:1069584784
 * csdn:http://blog.csdn.net/wuyinlei
 */

public abstract class CommentAdapter<T> extends RecyclerView.Adapter<CommentViewHolder> {

    /**
     * 这里我我们是提取的公共的，所以我们在这用泛型T，而不是给出具体的值，具体的交给我们的实现类去传入
     */
    private List<T> mTList;
    //布局id
    private int layoutId;


    /**
     * 这里构造函数，传入数据的list和布局
     *
     * @param TList
     * @param layoutId
     */
    public CommentAdapter(List<T> TList, int layoutId) {
        mTList = TList;
        this.layoutId = layoutId;
    }

    @Override
    public CommentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(layoutId, null);
        return new CommentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CommentViewHolder holder, int position) {
        convert(holder, mTList.get(position));
    }

    /**
     * 留给调用者去实现
     *
     * @param holder
     * @param t
     */
    public abstract void convert(CommentViewHolder holder, T t) ;

    @Override
    public int getItemCount() {
        return mTList.size();
    }
}
