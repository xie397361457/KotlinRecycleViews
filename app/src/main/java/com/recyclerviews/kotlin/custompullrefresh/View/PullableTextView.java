package com.recyclerviews.kotlin.custompullrefresh.View;


import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.recyclerviews.kotlin.custompullrefresh.Constant.Side;
import com.recyclerviews.kotlin.custompullrefresh.Inteface.Pullable;

/**
 * Created by 宗仁 on 16/5/31.
 * All Rights Reserved By 宗仁.
 */
public class PullableTextView extends TextView implements Pullable {

    public PullableTextView(Context context) {
        super(context);
    }

    public PullableTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PullableTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean reachEdgeOfSide(Side side) {
        return true;
    }
}
