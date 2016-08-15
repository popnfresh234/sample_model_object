package com.dmtaiwan.alex.modelobjectsample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dmtaiwan.alex.modelobjectsample.R;
import com.dmtaiwan.alex.modelobjectsample.models.Vegetable;

import java.util.List;

/**
 * Created by Alex on 8/15/2016.
 */
public class VegetableAdapter extends RecyclerView.Adapter<VegetableAdapter.ViewHolder> {

    private List<Vegetable> mVegetableList;
    private Context mContext;

    public VegetableAdapter(Context context, List<Vegetable> vegetables) {
        this.mVegetableList = vegetables;
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_vegetable, parent, false);

        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Vegetable vegetable = mVegetableList.get(position);
        holder.vegetableImage.setImageDrawable(mContext.getResources().getDrawable(vegetable.getImgRes()));
        holder.vegetableName.setText(vegetable.getName());
        holder.vegetableNameSci.setText(vegetable.getScientificName());
    }

    @Override
    public int getItemCount() {
        if (mVegetableList == null) {
            return 0;
        } else return mVegetableList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView vegetableImage;
        public TextView vegetableName;
        public TextView vegetableNameSci;

        public ViewHolder(View view) {
            super(view);
            vegetableImage = (ImageView) view.findViewById(R.id.vegetableImage);
            vegetableName = (TextView) view.findViewById(R.id.vegetable_name);
            vegetableNameSci = (TextView) view.findViewById(R.id.vegetable_name_sci);
        }
    }

}
