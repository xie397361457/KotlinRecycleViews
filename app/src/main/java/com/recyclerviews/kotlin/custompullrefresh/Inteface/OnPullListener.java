package com.recyclerviews.kotlin.custompullrefresh.Inteface;


import com.recyclerviews.kotlin.custompullrefresh.Main.PullableComponent;


public interface OnPullListener {
    void onCanceled(PullableComponent pullableComponent);

    void onLoading(PullableComponent pullableComponent);

    void onSizeChanged(PullableComponent pullableComponent, int mSize);
}
