package com.mycompany.jsonobject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class contentAdapter  extends BaseAdapter {
    List<contentJSON> arrayContent;

    public contentAdapter(List<contentJSON> contentList){
            arrayContent = contentList;
    }

    @Override
    public int getCount() {
        return arrayContent.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_custom, parent, false);
        }

        //Anh xa va gan gia tri
        TextView txtName = (TextView) convertView.findViewById(R.id.name);
        txtName.setText(arrayContent.get(position).getName());

        TextView txtEmail = (TextView) convertView.findViewById(R.id.email);
        txtEmail.setText(arrayContent.get(position).getEmail());

        TextView txtBody = (TextView) convertView.findViewById(R.id.body);
        txtBody.setText(arrayContent.get(position).getBody());

        return convertView;
    }
}
