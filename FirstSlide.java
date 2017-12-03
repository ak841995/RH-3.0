package com.example.dodob.rajasthan;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstSlide extends AppCompatActivity {
    private ViewPager viewPager;
    private  FirstSlideAdapter myadapter;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_slide);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        myadapter=new FirstSlideAdapter(this);
        viewPager.setAdapter(myadapter);
        textView=(TextView)findViewById(R.id.skip);
    }

    public void skip(View view){
        startActivity(new Intent(FirstSlide.this,MainPage.class));
        finish();
    }
}

