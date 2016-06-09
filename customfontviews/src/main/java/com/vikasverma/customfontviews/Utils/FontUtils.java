package com.vikasverma.customfontviews.Utils;

import android.content.Context;
import android.graphics.Typeface;

public class FontUtils {
    public static Typeface getTypeface(Context context,String fontName) throws Exception{
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + fontName);
        return typeface;
    }
}
