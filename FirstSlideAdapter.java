package com.example.dodob.rajasthan;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by dodob on 02-Dec-17.
 */

public class FirstSlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    public int[] lst_images={
            R.drawable.image1,

            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4
    };

    public String[] lst_title={
            "RONALD",
            "BENJAMIN",
            "GALAXY",
            "ROCKET"
    };

    public String[] lst_description={
            "DESCRIPTION 1",
            "DESCRIPTION 2",
            "DESCRIPTION 3",
            "DESCRIPTION 4"
    };
    public int[] lst_background={
            Color.rgb(55,55,55),
            Color.rgb(239,85,85),
            Color.rgb(110,49,89),
            Color.rgb(1,188,212)

    };

    public FirstSlideAdapter(Context  context){
        this.context=context;
    }


    @Override
    public int getCount() {
        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.first_slide,container,false);
        LinearLayout layoutslide =view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide=(ImageView)view.findViewById(R.id.slideimg);
        TextView txttitle=(TextView) view.findViewById(R.id.txtTitle);
        TextView description=(TextView) view.findViewById(R.id.txtdescription);
        TextView textView=(TextView)view.findViewById(R.id.skip);

        layoutslide.setBackgroundColor(lst_background[position]);
        imgslide.setImageResource(lst_images[position]);
        txttitle.setText(lst_title[position]);
        description.setText(lst_description[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
