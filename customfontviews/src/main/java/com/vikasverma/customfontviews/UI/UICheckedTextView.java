package com.vikasverma.customfontviews.UI;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

import com.vikasverma.customfontviews.R;
import com.vikasverma.customfontviews.Utils.FontUtils;

public class UICheckedTextView extends CheckedTextView {
    private boolean mIsBold;
    private String mFontName;

    public UICheckedTextView(Context context) {
        super(context, null);
        init(null);
    }

    public UICheckedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public UICheckedTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.CustomFontView);
            mFontName = a.getString(R.styleable.CustomFontView_fontName);
            mIsBold = a.getBoolean(R.styleable.CustomFontView_bold, false);
            updateFont();
            a.recycle();
        }
    }



    private void updateFont() {
        if (mFontName != null) {
            Typeface myTypeface = null;
            try {
                myTypeface = FontUtils.getTypeface(getContext(), mFontName);
                setTypeface(myTypeface, mIsBold ? Typeface.BOLD : Typeface.NORMAL);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setFontName(String fontName){
        mFontName=fontName;
        updateFont();
    }
}
