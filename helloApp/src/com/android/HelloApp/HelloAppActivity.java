package com.android.HelloApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HelloAppActivity extends Activity {
   TextView textName;
   EditText editName;
   Button changeButton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        textName=(TextView)findViewById(R.id.textName);
        editName=(EditText)findViewById(R.id.editName);
        changeButton=(Button)findViewById(R.id.changeButton);
        
        
        changeButton.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {				
					editName.setText(editName.getText().toString()+" Webonise");	
					Toast.makeText(HelloAppActivity.this, "Webonise Lab", Toast.LENGTH_SHORT).show();
				
			}
		});
        
    }
}