package com.homework.dogs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    @Override
	private TextView dog_info;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		Dogs dog = new Dogs();
		dog_info = (TextView) findViewById(R.id.dog_info);
		Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		
		dog.breed = "ჰასკი";
		dog.name = "რიჩი";
		dog.age = 2;
		
		String details = dog.get_info();
		dog_info.setText(details);
        
    }
    
}
