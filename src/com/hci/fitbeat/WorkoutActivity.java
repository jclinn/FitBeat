package com.hci.fitbeat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WorkoutActivity extends Activity {
	
	Button easy;
	Button med;
	Button hard;
	private int workout;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        Bundle bundle = getIntent().getExtras();
		workout = bundle.getInt("workout");
        addOnClickListener();
     
	}
    private void addOnClickListener() {
		easy = (Button) findViewById(R.id.easy);
		easy.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(WorkoutActivity.this, com.hci.fitbeat.AndroidBuildingMusicPlayerActivity.class);
				intent.putExtra("mode", 1);
				intent.putExtra("workout", workout);
				startActivity(intent);
			}
		});
		
		med = (Button) findViewById(R.id.medium);
		med.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(WorkoutActivity.this, com.hci.fitbeat.AndroidBuildingMusicPlayerActivity.class);
				intent.putExtra("mode", 2);
				intent.putExtra("workout", workout);
				startActivity(intent);
			}
		});
		
		hard = (Button) findViewById(R.id.hard);
		hard.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(WorkoutActivity.this, com.hci.fitbeat.AndroidBuildingMusicPlayerActivity.class);
				intent.putExtra("mode", 3);
				intent.putExtra("workout", workout);
				startActivity(intent);
			}
		});
    	
    }

}
