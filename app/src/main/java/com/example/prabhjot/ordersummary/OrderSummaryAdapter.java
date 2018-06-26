package com.example.prabhjot.ordersummary;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class OrderSummaryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<OrderSummaryModel> arrayList;
    private Context context;

    public OrderSummaryAdapter(ArrayList<OrderSummaryModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.os_model_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        final MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.tvTestName.setText(arrayList.get(position).getTestName());
        myViewHolder.tvServiceType.setText(arrayList.get(position).getServiceType());
        myViewHolder.tvDescription.setText(arrayList.get(position).getDescription());

        boolean routine= arrayList.get(position).isPriorityRoutine();

        if(routine)
            myViewHolder.tvPriority.setText("Routine");

        else
            myViewHolder.tvPriority.setText("");

        myViewHolder.tvRemarks.setText(arrayList.get(position).getRemarks());

        boolean isFavourite= arrayList.get(position).isFavourite();

        if(isFavourite)
            myViewHolder.ivFavourite.setImageResource(R.drawable.ic_favorite_red_24dp);
        else
            myViewHolder.ivFavourite.setImageResource(R.drawable.ic_favorite_border_black_24dp);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTestName;
        private TextView tvServiceType;
        private TextView tvDescription;
        private TextView tvPriority;
        private TextView tvRemarks;
        private ImageView ivFavourite;


        public MyViewHolder(View view) {
            super(view);

            tvTestName = (TextView) view.findViewById(R.id.med_name);
            tvServiceType = (TextView) view.findViewById(R.id.service_name_text_view);
            tvDescription = (TextView) view.findViewById(R.id.description_type);
            tvPriority = (TextView) view.findViewById(R.id.priority_type);
            tvRemarks = (TextView) view.findViewById(R.id.remarks_type);
            ivFavourite = (ImageView) view.findViewById(R.id.fav_med_icon);
        }

    }
}
