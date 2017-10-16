package com.example.hp.assi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by HP on 10/16/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    List<Dataset> mDataList;
    Context context1;
    ArrayList<Dataset> data;
    private LayoutInflater inflater;


    public Adapter(MainActivity context, ArrayList<Dataset> data, Context context1 ) {
        inflater = LayoutInflater.from(context);
        this.mDataList = data;
        this.context1=context1;
        this.data=data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view,context1,data);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
      Dataset current = mDataList.get(position);
        holder.setData(current, position);
        holder.setListeners();
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public void removeItem(int position) {
        mDataList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, mDataList.size());
    }


    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;
        ImageView imgThumb;
        Button Delete;
        int position;
        Dataset current;
        ArrayList<Dataset> data= new ArrayList<Dataset>();
        Context context1;

        public MyViewHolder(View itemView,Context context1,ArrayList<Dataset> data) {
            super(itemView);
            this.data=data;
            this.context1=context1;
            title       = (TextView)  itemView.findViewById(R.id.tvTitle);
            imgThumb    = (ImageView) itemView.findViewById(R.id.img_row);
           Delete  = (Button) itemView.findViewById(R.id.img_row_delete);

        }

        public void setData(Dataset current, int position) {
            this.title.setText(current.getTitle());
            imgThumb.setImageResource(current.getImageID());
            this.position = position;
            this.current = current;
        }

        public void setListeners() {
            Delete.setOnClickListener(MyViewHolder.this);

            imgThumb.setOnClickListener(MyViewHolder.this);
        }

        @Override
        public void onClick(View v) {
            int position=getAdapterPosition();
            Dataset data=this.data.get(position);
            Intent intent=new Intent(this.context1,CntDetail.class);
            intent.putExtra("img id",data.getImageID());
            intent.putExtra("Name",data.getTitle());
            intent.putExtra("Email",data.getDescription());
            intent.putExtra("MobNo","09001801");
            this.context1.startActivities(new Intent[]{intent});
            switch (v.getId()) {
                case R.id.img_row_delete:
                    removeItem(position);
                    break;


            }
        }
    }
}

