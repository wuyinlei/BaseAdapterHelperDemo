package com.example.baseadapterhelperdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 若兰 on 2016/2/13.
 * 一个懂得了编程乐趣的小白，希望自己
 * 能够在这个道路上走的很远，也希望自己学习到的
 * 知识可以帮助更多的人,分享就是学习的一种乐趣
 * QQ:1069584784
 * csdn:http://blog.csdn.net/wuyinlei
 */

public class CommentViewHolder extends RecyclerView.ViewHolder {


    /**
     * 这个稀疏数组，网上说的是提高效率的
     */
    private final SparseArray<View> views;
    private View convertView;

    /**
     * 如果用到了，比如我们用glide加载图片的时候，还有其他的需要用到上下文的时候
     */
    private Context mContext;

    public CommentViewHolder(View itemView) {
        super(itemView);
        views = new SparseArray<>();
        convertView = itemView;
        mContext = itemView.getContext();
    }

    /**
     * 返回一个具体的view对象
     * 这个就是借鉴的base-adapter-helper中的方法
     *
     * @param viewId
     * @param <T>
     * @return
     */
    protected <T extends View> T getView(int viewId) {
        View view = views.get(viewId);
        if (view == null) {
            view = convertView.findViewById(viewId);
            views.put(viewId, view);
        }
        return (T) view;
    }

    public void setText(int resId, String text) {
        TextView view = getView(resId);
        view.setText(text);
    }

    /**
     * 下面的这个是加载显示图片的，我用到了glide，这里只是演示，并没有显示
     *
     * @param resId
     * @param url
     */
    public void setImageByUrl(int resId, String url) {
        ImageView imageView = getView(resId);
        //Glide.with(mContext).load(url).asBitmap().into(imageView);
    }

    //// TODO: 2016/2/13  当然了哈，在这里我们可以定义其他的方法，这个demo我只是设置了textview，想要使用其他空间的
    //自己去定义方法

}
