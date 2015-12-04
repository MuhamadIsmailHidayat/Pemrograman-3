package com.loginaplikasi;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends Activity
{
	String password;
	String nama;
	String namaku = "login";
	String passwrd = "123";
	EditText name;
	EditText passwd,tampil;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        name = (EditText)findViewById(R.id.txtuser);
        passwd = (EditText)findViewById(R.id.txtpassword);
        Button submit = (Button)findViewById(R.id.btnExit);
        submit.setOnClickListener(new click());
    }
    
    @SuppressLint("ShowToast")
    class click implements Button.OnClickListener
    {
	    @SuppressLint("ShowToast")
	    public void onClick(View v)
	    {
		    nama = name.getText().toString();
		    password = passwd.getText().toString();
		    if((password.equals(passwrd))&&(nama.equals(namaku)))
		    {
		           Toast.makeText(getApplicationContext(),"Welcome, You Succes Login..." ,31).show();
		           Intent i = new Intent(login.this, activity_login.class);
		           startActivity(i);
		    }
		    else
		           Toast.makeText(getApplicationContext(),"Sorry..., Username or password you wrong !!!",23).show();
		           name.setText("");
		           passwd.setText("");
	    }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }
    
}
