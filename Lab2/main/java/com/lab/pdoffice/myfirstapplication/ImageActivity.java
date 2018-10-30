package com.lab.pdoffice.myfirstapplication;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {

    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        iv=findViewById(R.id.imageView);
    }


    public void b2click(View v){
      /*  Intent returnIntent = new Intent();
        returnIntent.putExtra("Message", "Checking Return Intent");
        setResult(RESULT_OK,returnIntent);
        finish(); */
      iv.setImageResource(R.drawable.ic_launcher_background);
    }

}
