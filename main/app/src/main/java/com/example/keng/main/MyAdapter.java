package com.example.keng.main;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by keng on 5/7/17.
 */

//參考網址http://xnfood.com.tw/android-recyclerview-list/
//建立一個Adapter 控管每個item的顯示設定，自訂一個Adapter類別
public class  MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    //利用建構子將資料清單傳進來
    private List<String> mDataset;

    public  MyAdapter(List<String> data){
        mDataset=data;
    }
    //指定item所使用的view佈局
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }
    //透過position指定每個item所用到的資料
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txtItem.setText((mDataset.get(position)));
    }
    //傳回清單的數量
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
    //透過View Holder定義介面和邏輯
    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView txtItem;
        public ViewHolder(View itemView) {
            super(itemView);
            txtItem=(TextView)itemView.findViewById(R.id.textView);
        }
    }
}
