package com.api.dissertation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ModelAdapter extends ArrayAdapter<Model> {
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,
                    parent,
                    false
            );
        }
        Model currentModel = getItem(position);
        TextView title = listItemView.findViewById(R.id.title);
        TextView descp = listItemView.findViewById(R.id.descp);
        ImageView logo = listItemView.findViewById(R.id.logo);

        String tit = currentModel.getTitle();
        String desc = currentModel.getDescription();

        logo.setImageResource(currentModel.getmImageResourceId());
        title.setText(tit);
        descp.setText(desc);
        return listItemView;
    }

    public ModelAdapter(@NonNull Context context, ArrayList<Model> model) {
        super(context,0,  model);
    }
}
