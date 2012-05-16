package com.android.ProfileApplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity {
	TextView textName,textPassword;
	EditText editName,editPassword;
	Button buttonLogin;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		textName=(TextView)findViewById(R.id.textName);
		editName=(EditText)findViewById(R.id.editName);
		textPassword=(TextView)findViewById(R.id.textPassword);
		editPassword=(EditText)findViewById(R.id.editPassword);

		buttonLogin=(Button)findViewById(R.id.buttonLogin);
		buttonLogin.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if(editName.getText().toString().equals("pallavi") && editPassword.getText().toString().equals("webonise"))
				{
					Intent intent=new Intent(LoginActivity.this, ProfileActivity.class);
					startActivity(intent);
				}
				else
				{
					Toast.makeText(LoginActivity.this, "Check username or password..", Toast.LENGTH_SHORT).show();
				}

			}
		});
	}
}