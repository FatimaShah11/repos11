package com.example.bsef18a544;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView mImageView;
    TextView mResultTv;
    View mColorView;

    Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView=findViewById(R.id.imageView);
        mResultTv=findViewById(R.id.resultTv);
        mColorView=findViewById(R.id.colorView);

        mImageView.setDrawingCacheEnabled(true);
        mImageView.buildDrawingCache(true);

        mImageView.setOnTouchListener(new View.OnTouchListener(){

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN || event.getAction() == MotionEvent.ACTION_MOVE) {
                    bitmap = mImageView.getDrawingCache();
                    int pixel = bitmap.getPixel((int) event.getX(), (int) event.getY());
                    int r = Color.red(pixel);
                    int g = Color.green(pixel);
                    int b = Color.blue(pixel);





                    String hex = "#" + Integer.toHexString(pixel);
                    String name = "";
                    if(r == 237 && g == 31 && b == 36){ name = "Red";}
                    if(r == 32 && g == 175 && b == 75){ name = "DarkGreen";}
                    if(r == 139 && g == 198 && b == 63){ name = "LightGreen";}
                    if(r == 243 && g == 236 && b == 25){ name = "Yellow";}
                    if(r == 247 && g == 148 && b == 30){ name = "Mustard";}
                    if(r == 254 && g == 198 && b == 12){ name = "Dark Shade Of Yellow";}
                    if(r == 242 && g == 103 && b == 34){ name = "Orange";}
                    if(r == 196 && g == 26 && b == 125){ name = "Rosy Pink";}
                    if(r == 100 && g == 46 && b == 145){ name = "Purple";}
                    if(r == 41 && g == 53 && b == 146){ name = "NeviBlue";}
                    if(r == 28 && g == 101 && b == 177){ name = "DarkBlue";}
                    if(r == 11 && g == 163 && b == 199){ name = "SkyBlue";}


                    mColorView.setBackgroundColor(Color.rgb(r, g, b));
                    mResultTv.setText("COLOR NAME: "+name+"\nRGB: " + r + "," + g + "," + b +"\nHEX: " + hex);


                }
                return true;
            }
        });
    }
}