package com.example.daniel_alfredo.cardioguia;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Hta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GraficosView(this));

        TouchImageView img = new TouchImageView(this);
        img.setImageResource(R.drawable.hta_monografia);
        img.setMaxZoom(5f);
        setContentView(img);
    }

    public class GraficosView extends View {
        public GraficosView(Context context) {
            super(context);
        }
    }

}
