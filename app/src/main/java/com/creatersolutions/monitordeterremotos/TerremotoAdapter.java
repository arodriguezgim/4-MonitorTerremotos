package com.creatersolutions.monitordeterremotos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class TerremotoAdapter extends ArrayAdapter<Terremoto> {

    private ArrayList<Terremoto> eqList;
    private Context context;
    private int layoutId;


    public TerremotoAdapter(@NonNull Context context, int resource, @NonNull List<Terremoto> terremotos) {
        super(context, resource, terremotos);

        this.context = context;
        this.layoutId = resource;
        eqList = new ArrayList<>(terremotos);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //View rootView = inflater.inflate(R.layout.eq_list_item, null);
        View rootView = inflater.inflate(layoutId, null);

        TextView magnitudTextView = rootView.findViewById(R.id.eq_list_item_magnitud);
        TextView lugarTextView = rootView.findViewById(R.id.eq_lis_item_lugar);

        Terremoto terremoto = eqList.get(position);

        magnitudTextView.setText(terremoto.getMagnitud());
        lugarTextView.setText(terremoto.getLugar());

        return rootView;
        //return super.getView(position, convertView, parent);
    }
}
