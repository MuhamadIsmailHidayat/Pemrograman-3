package com.loginaplikasi;

import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class activity_login extends Activity
{
	Button btnExit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity__login);
		addListenerOnButton();
	}
	
	public void addListenerOnButton()
	{
    	final Context context = this;
    	btnExit = (Button) findViewById(R.id.btnExit);
    	btnExit.setOnClickListener(new View.OnClickListener()
    	{
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				Intent i = new Intent(context,login.class);
				startActivity(i);
			}
		});
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity__login, menu);
		return true;
	}

}
