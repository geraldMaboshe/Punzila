package com.example.gerald.punzilaii;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onButtonClick(View v) {

        if (v.getId() == R.id.LogIn) {
            EditText a = (EditText) findViewById(R.id.upUsername);
            String str = a.getText().toString();

           EditText b = (EditText) findViewById(R.id.upPassword);
            String password = b.getText().toString();

            String pass = helper.searchPass(str);
          if (password.equals(pass)) {
                Intent intent = new Intent(MainActivity.this, LogIn.class);
                intent.putExtra("Username", str);
                startActivity(intent);
           } else {
                Toast temp = Toast.makeText(MainActivity.this, "Username and Password don't match", Toast.LENGTH_SHORT);
                temp.show();
            }
        }

        if (v.getId() == R.id.signUp) {
            Intent intent = new Intent(MainActivity.this, SignUp.class);
            startActivity(intent);
        }





    }
}
