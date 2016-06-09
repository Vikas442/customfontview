package com.vikasverma.customfontviews.UI;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ProgressBar;

import com.vikasverma.customfontviews.R;

public class UIProgressBar extends ProgressBar {
    private Context mContext;
    private int mRingColor;

    public UIProgressBar(Context context) {
        super(context);
        mContext = context;
        init(null);
    }

    public UIProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        init(attrs);
    }

    public UIProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        init(attrs);
    }

    public UIProgressBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        mContext = context;
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.CustomProgressBar);
            mRingColor = a.getColor(R.styleable.CustomProgressBar_ringColor, Color.BLACK);
            getIndeterminateDrawable().setColorFilter(mRingColor, PorterDuff.Mode.SRC_IN);
            a.recycle();
        }
    }
}
