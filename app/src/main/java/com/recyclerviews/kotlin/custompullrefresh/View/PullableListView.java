package com.recyclerviews.kotlin.custompullrefresh.View;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

import com.recyclerviews.kotlin.custompullrefresh.Constant.Side;
import com.recyclerviews.kotlin.custompullrefresh.Inteface.Pullable;


/**
 * Created by 宗仁 on 16/5/31.
 * All Rights Reserved By 宗仁.
 */
public class PullableListView extends ListView implements Pullable {

    public PullableListView(Context context) {
        super(context);
    }

    public PullableListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PullableListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public boolean reachEdgeOfBottom() {
        if (getCount() == 0) {
            return true;
        } else if (getLastVisiblePosition() == (getCount() - 1)) {
            if (getChildAt(getLastVisiblePosition() - getFirstVisiblePosition()) != null && getChildAt(getLastVisiblePosition() - getFirstVisiblePosition()).getBottom() <= getMeasuredHeight()) {
                return true;

            }
        }
        return false;
    }

    @Override
    public boolean reachEdgeOfSide(Side side) {
        if ((side.getValue() & Side.TOP.getValue()) > 0) {
            return reachEdgeOfTop();
        } else if ((side.getValue() & Side.BOTTOM.getValue()) > 0) {
            return reachEdgeOfBottom();
        } else {
            return true;
        }
    }

    public boolean reachEdgeOfTop() {
        if (getCount() == 0) {
            return true;
        } else if (getFirstVisiblePosition() == 0 && getChildAt(0).getTop() >= 0) {
            return true;
        }
        return false;
    }
}
