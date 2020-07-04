package com.example.ihavetofly;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Background {

    public int x=0;
    int y=0;
   public Bitmap background;

    public Background(int screenX, int screenY, Resources res){

        background = BitmapFactory.decodeResource(res, R.drawable.bg3);
        background = Bitmap.createScaledBitmap(background,screenX,screenY , false);

    }

}
