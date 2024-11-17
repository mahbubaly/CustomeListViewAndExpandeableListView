package com.example.vehicles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class BikeExpandableAdapter extends BaseExpandableListAdapter {
    private Context context;
    private String[] titles;
    private String[][] subtitles;
    private Integer[] images;

    public BikeExpandableAdapter(Context context, String[] titles, String[][] subtitles, Integer[] images) {
        this.context = context;
        this.titles = titles;
        this.subtitles = subtitles;
        this.images = images;
    }

    @Override
    public int getGroupCount() {
        return titles.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return subtitles[groupPosition].length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return titles[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return subtitles[groupPosition][childPosition];
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.group_item, parent, false);
        }
        TextView titleView = convertView.findViewById(R.id.title);
        ImageView iconView = convertView.findViewById(R.id.iv_image);
        titleView.setText(titles[groupPosition]);
        iconView.setImageResource(images[groupPosition]);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.child_item, parent, false);
        }
        TextView subtitleView = convertView.findViewById(R.id.subtitle);
        subtitleView.setText(subtitles[groupPosition][childPosition]);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
