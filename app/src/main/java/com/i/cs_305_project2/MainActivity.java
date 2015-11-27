package com.i.cs_305_project2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    public static Cipher cipher;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cipher = new Cipher();
        setContentView(R.layout.activity_main);
    }

    public void encrypt(View v) {
        EditText orginal = (EditText) findViewById(R.id.orginal_text);
        String orginal_text = orginal.getText().toString();

        TextView encrypt = (TextView) findViewById(R.id.encrypt_text);

        cipher.setCharacter(orginal_text);
        encrypt.setText(cipher.encrypt());

    }

    public void modifyData( View v ) {
        Intent myIntent = new Intent( this, ShiftActivity.class );
        this.startActivity( myIntent );
        overridePendingTransition( R.anim.slide, 0 );
    }

    protected void onStart( ) {
        super.onStart( );
    }

    protected void onRestart( ) {
        super.onRestart( );
    }

    protected void onResume( ) {
        super.onResume( );
    }

    protected void onPause( ) {
        super.onPause( );
    }

    protected void onStop( ) {
        super.onStop( );
    }

    protected void onDestroy( ) {
        super.onDestroy( );
    }
}
