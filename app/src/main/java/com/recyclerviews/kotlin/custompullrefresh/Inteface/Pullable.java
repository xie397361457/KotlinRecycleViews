package com.recyclerviews.kotlin.custompullrefresh.Inteface;

import com.recyclerviews.kotlin.custompullrefresh.Constant.Side;


public interface Pullable {
    boolean reachEdgeOfSide(Side side);
}
