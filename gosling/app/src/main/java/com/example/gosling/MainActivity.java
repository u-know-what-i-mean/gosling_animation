package com.example.gosling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean ryanImageShown = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView ryanImageView = findViewById(R.id.imageViewRyan1);
        ryanImageView.animate().rotation(360).setDuration(1500);
    }

//изменение масштаба scaleY(*.*f) scaleX(*.*f)
//метод перемещения translationXby(+/- *** количество пикселей)  translationXby
//анимация по нажатию на Гослинга
    public void eraseRyan(View view) {

    //здесь он плавно исчезает и появляется
        if (ryanImageShown){
            ImageView ryanImageView = findViewById(R.id.imageViewRyan1);
            ryanImageView.animate().alpha(0).rotation(ryanImageView.getRotation() + 1800).scaleX(0).scaleY(0).setDuration(1500);

            ImageView ryan1ImageView = findViewById(R.id.imageViewRyan2);
            ryan1ImageView.animate().alpha(1).rotation(ryan1ImageView.getRotation() + 1800).scaleX(1).scaleY(1).setDuration(1500);

            ryanImageShown = false;
        }

        else {
            ImageView ryanImageView = findViewById(R.id.imageViewRyan1);
            ryanImageView.animate().alpha(1).rotation(ryanImageView.getRotation() + 1800).scaleX(1).scaleY(1).setDuration(1500);

            ImageView ryan1ImageView = findViewById(R.id.imageViewRyan2);
            ryan1ImageView.animate().alpha(0).rotation(ryan1ImageView.getRotation() + 1800).scaleX(0).scaleY(0).setDuration(1500);

            ryanImageShown = true;
        }



    }

}