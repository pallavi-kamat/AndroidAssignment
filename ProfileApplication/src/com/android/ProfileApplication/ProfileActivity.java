package com.android.ProfileApplication;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends Activity{
	TextView textProfileName,textEmailId,textGender,textHobbies;
	EditText editProfileName,editEmailId;
	RadioGroup radioGender;
	CheckBox checkReading,checkPlaying,checkSkeching;
	Button buttonSave;
	String gender;
	ArrayList<String> array;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.profile);

		textProfileName=(TextView)findViewById(R.id.textProfileName);
		editProfileName=(EditText)findViewById(R.id.editProfileName);

		textEmailId=(TextView)findViewById(R.id.textEmailId);
		editEmailId=(EditText)findViewById(R.id.editEmailId);

		textGender=(TextView)findViewById(R.id.textEmailId);
		radioGender=(RadioGroup)findViewById(R.id.radioGender);

		textHobbies=(TextView)findViewById(R.id.textHobbies);
		checkReading=(CheckBox)findViewById(R.id.checkReading);
		checkPlaying=(CheckBox)findViewById(R.id.checkPlaying);
		checkSkeching=(CheckBox)findViewById(R.id.checkSkeching);
		array=new ArrayList<String>();



		buttonSave=(Button)findViewById(R.id.buttonSave);
		buttonSave.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				Intent intent=new Intent(ProfileActivity.this,DisplayProfileActivity.class);
				intent.putExtra("profileName",editProfileName.getText().toString());
				intent.putExtra("emailId",editEmailId.getText().toString());

				if(radioGender.isEnabled()==true)
				{
					int id=radioGender.getCheckedRadioButtonId();
					if(id==R.id.radioMale)
					{
						gender="male";
					}
					if(id==R.id.radioFemale)
					{
						gender="female";
					}
				}
				else
				{
					Toast.makeText(ProfileActivity.this, "Select Gender", Toast.LENGTH_SHORT).show();
				}
				intent.putExtra("gender", gender);

				if(checkReading.isChecked())
				{	
					//Toast.makeText(ProfileActivity.this, "Reading", Toast.LENGTH_SHORT).show();
					array.add("Reading");
				}

				if(checkPlaying.isChecked())
				{
					//Toast.makeText(ProfileActivity.this, "Playing", Toast.LENGTH_SHORT).show();
					array.add("Playing");
				}

				if(checkSkeching.isChecked())
				{
					//Toast.makeText(ProfileActivity.this, "Skeching", Toast.LENGTH_SHORT).show();
					array.add("Skeching");
				}

				intent.putStringArrayListExtra("array", array);

				startActivity(intent);


			}
		});

	}
}
