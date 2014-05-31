package com.hci.fitbeat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectModeActivity extends Activity {
	
	Button auto;
	Button interval;
	Button hill;
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode);
        addOnClickListener();
     
	}
    private void addOnClickListener() {
		auto = (Button) findViewById(R.id.auto);
		auto.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(SelectModeActivity.this, com.hci.fitbeat.WorkoutActivity.class);
				intent.putExtra("workout", 1);
				startActivity(intent);
			}
		});
		
		interval = (Button) findViewById(R.id.interval);
		interval.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(SelectModeActivity.this, com.hci.fitbeat.WorkoutActivity.class);
				intent.putExtra("workout", 2);
				startActivity(intent);
			}
		});
		
		hill = (Button) findViewById(R.id.hillclimb);
		hill.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(SelectModeActivity.this, com.hci.fitbeat.WorkoutActivity.class);
				intent.putExtra("workout", 3);
				startActivity(intent);
			}
		});
    	
    }

}
