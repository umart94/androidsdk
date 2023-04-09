package com.example.androidapp;


import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
        	
        		
        		
        	

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.moment);
        		mp.start();
			}
        	
        });
   
    }
}