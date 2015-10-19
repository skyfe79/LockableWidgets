package kr.pe.burt.android.lib.lockablewidgets;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * This is lockable ViewPager
 * You can lock the swiping of ViewPager.
 * Created by burt on 15. 10. 14..
 */
public class LockableViewPager extends ViewPager {
    private boolean swipeable;

    public LockableViewPager(Context context) {
        super(context);
        swipeable = true;
    }

    public LockableViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        swipeable = true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if(swipeable) {
            return super.onTouchEvent(ev);
        }
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if(swipeable) {
            return super.onInterceptTouchEvent(ev);
        }
        return false;
    }

    public void setEnableSwipe(boolean swipeable) {
        this.swipeable = swipeable;
    }

    public boolean isSwipeable() {
        return swipeable;
    }
}
