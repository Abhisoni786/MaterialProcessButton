package com.uigitdev.paymentprocessbutton;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.uigitdev.paymentprocessbutton.uigitdev.design.MaterialButtonProcess;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.material_button);
        final MaterialButtonProcess materialButton = new MaterialButtonProcess(view);
        materialButton.setText(getString(R.string.app_payment));
        materialButton.setBackgroundColor(getString(R.color.colorAccent));
        materialButton.setVectorIcon(R.drawable.ic_shopping_cart);
        materialButton.setRadiusPixel(2);
        materialButton.setProgressColor(getString(R.color.colorWhite));
        materialButton.setIconColor(getString(R.color.colorWhite));
        materialButton.setTextColor(getString(R.color.colorWhite));

        materialButton.getButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialButton.setProgressVisibility(true);
            }
        });

    }
}
