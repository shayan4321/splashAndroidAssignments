package com.shayan.splash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class OnBoardingScreen extends AppCompatActivity {

    private ViewPager viewPager;
    private LinearLayout myDotLayout;
    private SliderAdapter sliderAdapter;
    private TextView[] myDots;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboardingscreen);
        viewPager=findViewById(R.id.viewPager);
        myDotLayout=findViewById(R.id.dots);
        sliderAdapter=new SliderAdapter(this);
        viewPager.setAdapter(sliderAdapter);
        addDotIndicators();


    }
    public void addDotIndicators(){

        myDots=new TextView[3];
        myDotLayout.removeAllViews();
        for (int i=0;i<myDots.length;i++){
        myDots[i]=new TextView(this);
        myDots[i].setText(Html.fromHtml("&#8226;"));
        myDots[i].setTextSize(35);
        myDots[i].setTextColor(getResources().getColor(R.color.colorAccent));
        myDotLayout.addView(myDots[i]);


        }
    }
}
