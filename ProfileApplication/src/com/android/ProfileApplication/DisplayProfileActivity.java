package com.android.ProfileApplication;

import java.util.ArrayList;
import java.util.Iterator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayProfileActivity extends Activity {

	TextView textName,textEmailId,textGender,textHobbies,textHobby1,textHobby2,textHobby3;
	String profileName,emailId,gender,hobby="";
	ArrayList<String> array;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.displayprofile);

		Intent intent=getIntent();

		profileName=(String)intent.getSerializableExtra("profileName");
		emailId=(String)intent.getSerializableExtra("emailId");
		gender=(String)intent.getSerializableExtra("gender");
		array=new ArrayList<String>();


		array=(ArrayList<String>)intent.getStringArrayListExtra("array");

		textName=(TextView)findViewById(R.id.textName);
		textName.setText("Name: "+profileName);
		textEmailId=(TextView)findViewById(R.id.textEmailId);
		textEmailId.setText("Email ID: "+emailId);
		textGender=(TextView)findViewById(R.id.textGender);
		textGender.setText("Gender: "+gender);
		textHobbies=(TextView)findViewById(R.id.textHobbies);
		textHobby1=(TextView)findViewById(R.id.textHobbiesPrint1);


		for(int i=0;i<array.size();i++)
		{
			hobby=hobby+array.get(i)+"\n";
		}
		textHobby1.setText(hobby);
	

	}
}
