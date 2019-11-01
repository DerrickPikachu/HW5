package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private int[] checkArr = {R.id.checkBox1, R.id.checkBox2, R.id.checkBox3, R.id.checkBox4, R.id.checkBox5};
    private int[] imgArr = {R.id.appear1, R.id.appear2, R.id.appear3, R.id.appear4, R.id.appear5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i : checkArr)
            ((CheckBox)findViewById(i)).setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        ImageView img = null;

        if (compoundButton.getId() == checkArr[0]) {
            img = findViewById(imgArr[0]);
        }
        else if (compoundButton.getId() == checkArr[1]) {
            img = findViewById(imgArr[1]);
        }
        else if (compoundButton.getId() == checkArr[2]) {
            img = findViewById(imgArr[2]);
        }
        else if (compoundButton.getId() == checkArr[3]) {
            img = findViewById(imgArr[3]);
        }
        else if (compoundButton.getId() == checkArr[4]) {
            img = findViewById(imgArr[4]);
        }

        if (b) {
            img.setVisibility(View.VISIBLE);
        }
        else {
            img.setVisibility(View.GONE);
        }
    }
}
