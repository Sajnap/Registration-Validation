package com.example.reg;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class SecondMainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity_main);
	}
	/*public void ButtonClicked(View v){

		EditText ed_name=(EditText) findViewById(R.id.editText1);
		String name=ed_name.getText().toString();

		EditText ed_email=(EditText) findViewById(R.id.editText2);
		String email=ed_email.getText().toString();
		
		EditText ed_address=(EditText) findViewById(R.id.editText3);
		String address=ed_address.getText().toString();
		
		EditText ed_phone=(EditText) findViewById(R.id.editText4);
		String phone=ed_phone.getText().toString();
		
		EditText ed_pass=(EditText) findViewById(R.id.editText5);
		String pass=ed_pass.getText().toString();
		
		if(name.equals(""))
		{
			ed_name.setError("Enter name");
		}
		else if(email.equals("")||!(email.length()>=15))
		{
			ed_email.setError("Email id must be at least 15 characters");
			return;
		}
		else if(address.equals(""))
		{
			ed_address.setError("Enter address");
		}
		else if(phone.equals("")||!(phone.length()==10))
		{
			ed_phone.setError("Phone number must be 10 digit");
		}
		else if(pass.equals("")||!(pass.length()>=8))
		{
			ed_pass.setError("Password must be at least 8 character");
		}
		
		Toast.makeText(getApplicationContext(),"Submitted", Toast.LENGTH_LONG).show();
		
	}*/

}
