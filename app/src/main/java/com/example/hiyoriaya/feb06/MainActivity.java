package com.example.hiyoriaya.feb06;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity implements CompoundButton.OnCheckedChangeListener{

    RelativeLayout rl;
    LinearLayout ll;
    int select;

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
            txt.setOnCheckedChangeListener(this);
            txt.setText(i + "番目");
            txt.setTextSize(20);
            ll.addView(txt);
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        TextView txt = new TextView(this);
        txt.setText("its a beautiful world");
        txt.setTextSize(20);
        rl.addView(txt);
        rl.getChildAt(0).setY(buttonView.getBottom());
        buttonView.setVisibility(View.INVISIBLE);
    }
}
