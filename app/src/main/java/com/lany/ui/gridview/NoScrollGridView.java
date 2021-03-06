package com.lany.ui.gridview;

/**
 * Created by user on 2015/12/18.
 */
import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * 解决ScrollView与GridView的冲突,不能滚动的GridView
 */
public class NoScrollGridView extends GridView {
    public NoScrollGridView(Context context) {
        super(context);
    }

    public NoScrollGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NoScrollGridView(Context context, AttributeSet attrs,
                            int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
