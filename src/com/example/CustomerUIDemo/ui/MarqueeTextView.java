package com.example.CustomerUIDemo.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

public class MarqueeTextView extends TextView
{

    private float textLength = 0f; // ���

    private float viewWidth = 0f; // ��ܼe��

    private float step = 0f; // ��r����y��

    private float speed = 1.0f; // �t��

    private float y = 0f; // ��r���a�y��

    private float start_point = 0.0f; // �_�I

    private float run_length = 0.0f; // ���ʶZ��

    private Paint paint = null;

    private String text = "";

    public MarqueeTextView(Context context) {
        super(context);
    }

    public MarqueeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MarqueeTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setSpeed(float speed)
    {
        this.speed = speed;
    }

    public void init()
    {
        paint = getPaint();
        text = getText().toString();
        textLength = paint.measureText(text);
        viewWidth = getWidth();
        step = textLength;
        //start_point = viewWidth + textLength;
        //run_length = viewWidth + textLength * 2;
        start_point = textLength;
        run_length = textLength * 2;
        y = getTextSize() + getPaddingTop();
    }

    @Override
    public void onDraw(Canvas canvas)
    {
        if (viewWidth == 0) {
        	super.onDraw(canvas);
            init();
        }
        
        if (textLength <= viewWidth ) {
        	super.onDraw(canvas);
        } else {
            canvas.drawText(text, start_point - step, y, paint);
            step += speed;
            if (step > run_length){
                step = textLength;
                start_point = viewWidth + textLength;
                run_length = viewWidth + textLength * 2;
            }//End if
            invalidate();	// ���eTextView�����e
            
        }//End if
    }
}