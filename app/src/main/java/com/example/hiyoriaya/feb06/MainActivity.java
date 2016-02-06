package com.example.hiyoriaya.feb06;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnTouchListener{

    RelativeLayout rl;
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
    }

    public void findView(){
        rl = (RelativeLayout)findViewById(R.id.rl);
        ll = (LinearLayout)findViewById(R.id.ll);

        for(int i=0;i<3;i++){
            RadioButton txt = new RadioButton(this);
            txt.setText(i+"番目");
            txt.setTextSize(20);
            ll.addView(txt);
            ll.getChildAt(i).setOnTouchListener(this);
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        TextView txt = new TextView(this);
        txt.setText("its a beautiful world");
        txt.setTextSize(20);
        rl.addView(txt);
        rl.getChildAt(0).setY(v.getBottom());

        return true;
    }
}
