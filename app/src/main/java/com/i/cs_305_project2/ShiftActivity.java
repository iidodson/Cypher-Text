package com.i.cs_305_project2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;


public class ShiftActivity extends ActionBarActivity {;

    public static Cipher cipher =  MainActivity.cipher;
    private EditText shift;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shift);
    }

    public void set_shift(View v) {
        shift = (EditText) findViewById(R.id.shift_text);
        String shift_text = shift.getText().toString();

        try {
            int shift_num = Integer.parseInt(shift_text);
            cipher.setShift(shift_num);
            goBack(v);
        } catch (NumberFormatException nfe) {
            //do nothing
        }

    }
    public void update(){
        shift = (EditText) findViewById(R.id.shift_text);
        shift.setText("" + cipher.getShift());
    }


    public void goBack( View v ) {
        this.finish( );
        overridePendingTransition(R.anim.slide, 0);

    }

    protected void onStart( ) {
        super.onStart( );
        update();
    }

    protected void onRestart( ) {
        super.onRestart( );
    }

    protected void onResume( ) {
        super.onResume( );
    }

    protected void onPause( ) {
        super.onPause();
    }

    protected void onStop( ) {
        super.onStop( );
    }

    protected void onDestroy( ) {
        super.onDestroy();
    }
}
