package com.johnsly.getgas;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by njerry on 7/30/15.
 */
public class MyIntro extends AppIntro {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_my_intro);
//    }

    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(AppIntroFragment.newInstance("Hey there...", "Running out of gas?", R.drawable.slide1, R.color.material_deep_teal_500));
        addSlide(AppIntroFragment.newInstance("Just pick up your phone...", "...and order...", R.drawable.slide2, R.color.material_deep_teal_500));
        addSlide(AppIntroFragment.newInstance("Enter your location...", "...and get gas delivered to your doorstep.", R.drawable.slide3, R.color.material_deep_teal_500));


        setBarColor(Color.parseColor("#3F51B5"));
        setSeparatorColor(Color.parseColor("#2196F3"));

        showSkipButton(true);
        showDoneButton(true);

        setVibrate(true);
        setVibrateIntensity(40);
    }

    private void loadInput(){
        Intent intent = new Intent(this, Input.class);
        startActivity(intent);
    }

    @Override
    public void onSkipPressed() {
        loadInput();
    }

    @Override
    public void onDonePressed() {
        loadInput();
    }

    public void getStarted(View v) {
        loadInput();
    }

}

