package com.recyclerviews.kotlin.custompullrefresh.Constant;


public enum Side {
    TOP(1),
    LEFT(2),
    BOTTOM(4),
    RIGHT(8),
    TOPANDBOTTOM(16),;

    private int mValue;

    Side(int value) {
        mValue = value;
    }

    public int getValue() {
        return mValue;
    }

}
