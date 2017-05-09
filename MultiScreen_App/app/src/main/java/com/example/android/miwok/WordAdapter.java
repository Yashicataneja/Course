package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.color;
import static android.R.attr.resource;

/**
 * Created by Yashica on 25/4/17.
 * Company PhyderCmss
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorsResourceId;


    public WordAdapter(Activity context, ArrayList<Word> words, int colorsresourceId ) {
        super(context,0, words);
        mColorsResourceId=colorsresourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
            // Get the {@link AndroidFlavor} object located at this position in the list
            Word currentword = getItem(position);

            // Find the TextView in the list_item.xml layout with the ID version_name
            TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
            // Get the version name from the current AndroidFlavor object and
            // set this text on the name TextView
            miwokTextView.setText(currentword.getmMiwokTranslation());

            // Find the TextView in the list_item.xml layout with the ID version_number
            TextView englishTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
            // Get the version number from the current AndroidFlavor object and
            // set this text on the number TextView
            englishTextView.setText(currentword.getmDefaultTranslation());

            // Find the ImageView in the list_item.xml layout with the ID list_item_icon
//            ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
//            // Get the image resource ID from the current AndroidFlavor object and
//            // set the image to iconView
//            iconView.setImageResource(currentAndroidFlavor.getImageResourceId());
            ImageView iconView = (ImageView) listItemView.findViewById(R.id.imageview);
            if (currentword.hasImage()){
                iconView.setImageResource(currentword.getmImageResourceId());
                iconView.setVisibility(View.VISIBLE);
            }else {
                iconView.setVisibility(View.GONE);
            }

            View textContainer = listItemView.findViewById(R.id.text_container);
            int color = ContextCompat.getColor(getContext(),mColorsResourceId);
            textContainer.setBackgroundColor(color);

            // Return the whole list item layout (containing 2 TextViews and an ImageView)
            // so that it can be shown in the ListView

        } return listItemView;

    }

    }

