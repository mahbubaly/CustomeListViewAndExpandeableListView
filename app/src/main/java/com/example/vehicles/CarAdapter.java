package com.example.vehicles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CarAdapter extends BaseAdapter {
    private final String[] titles;
    private final String[] subtitles;
    private final Integer[] images;
    private final Context context;

    public CarAdapter(Context context, String[] titles, String[] subtitles, Integer[] images) {
        this.context = context;
        this.titles = titles;
        this.subtitles = subtitles;
        this.images = images;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int position) {
        return titles[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item_car, parent, false);
        }

        TextView titleView = convertView.findViewById(R.id.cars_title);
        TextView subtitleView = convertView.findViewById(R.id.cars_subtitle);
        ImageView imageView = convertView.findViewById(R.id.iv_carimg);

        titleView.setText(titles[position]);
        subtitleView.setText(subtitles[position]);
        imageView.setImageResource(images[position]);

        convertView.setOnClickListener(v ->
                Toast.makeText(context, "Clicked on: " + titles[position], Toast.LENGTH_SHORT).show()
        );

        return convertView;
    }
}
