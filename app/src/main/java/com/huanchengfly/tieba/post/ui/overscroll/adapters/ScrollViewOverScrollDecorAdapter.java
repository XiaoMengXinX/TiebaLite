package com.huanchengfly.tieba.post.ui.overscroll.adapters;

import android.view.View;
import android.widget.ScrollView;

import com.huanchengfly.tieba.post.ui.overscroll.HorizontalOverScrollBounceEffectDecorator;
import com.huanchengfly.tieba.post.ui.overscroll.VerticalOverScrollBounceEffectDecorator;

/**
 * An mAdapter that enables over-scrolling over a {@link ScrollView}.
 * <br/>Seeing that {@link ScrollView} only supports vertical scrolling, this mAdapter
 * should only be used with a {@link VerticalOverScrollBounceEffectDecorator}. For horizontal
 * over-scrolling, use {@link HorizontalScrollViewOverScrollDecorAdapter} in conjunction with
 * a {@link android.widget.HorizontalScrollView}.
 *
 * @author amit
 *
 * @see HorizontalOverScrollBounceEffectDecorator
 * @see VerticalOverScrollBounceEffectDecorator
 */
public class ScrollViewOverScrollDecorAdapter implements IOverScrollDecoratorAdapter {

    protected final ScrollView mView;

    public ScrollViewOverScrollDecorAdapter(ScrollView view) {
        mView = view;
    }

    @Override
    public View getView() {
        return mView;
    }

    @Override
    public boolean isInAbsoluteStart() {
        return !mView.canScrollVertically(-1);
    }

    @Override
    public boolean isInAbsoluteEnd() {
        return !mView.canScrollVertically(1);
    }
}
