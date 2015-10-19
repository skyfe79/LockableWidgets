package kr.pe.burt.android.lib.lockablewidgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/**
 * This is lockable scrollview.
 * You can lock the scrolling of scrollview.
 * Created by burt on 15. 10. 12..
 */
public class LockableScrollView extends ScrollView {

    private boolean scrollable = true;
    public LockableScrollView(Context context) {
        super(context);
    }

    public LockableScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LockableScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public LockableScrollView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void setEnableScroll(boolean enabled) {
        scrollable = enabled;
    }

    public boolean isScrollable() {
        return scrollable;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        // 스크롤이 가능하면 부모뷰가 처리
        if(scrollable) {
            return super.onTouchEvent(ev);
        }
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        // 스크롤이 가능하면 부모뷰가 처리
        if(scrollable) {
            return super.onInterceptTouchEvent(ev);
        }
        return false;
    }
}
