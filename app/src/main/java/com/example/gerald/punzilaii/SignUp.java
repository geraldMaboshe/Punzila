package com.example.gerald.punzilaii;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Gerald on 11/9/2017.
 */
public class SignUp extends ActionBarActivity {
    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

    }
    public void onSignUpClick(View v){
        if(v.getId()==R.id.upSignUp){
            EditText name=(EditText)findViewById(R.id.upEmail);
            EditText email=(EditText)findViewById(R.id.upEmail);
            EditText password=(EditText)findViewById(R.id.upPassword);
            EditText password2=(EditText)findViewById(R.id.upPassword2);

            String nameStr=name.getText().toString();
            String usernameStr=name.getText().toString();
            String emailStr=email.getText().toString();
            String passwordStr=password.getText().toString();
            String password2Str=password2.getText().toString();

            if(!passwordStr.equals(password2Str)){
             //Alert
                Toast pass =Toast.makeText(SignUp.this,"Passwords don't match",Toast.LENGTH_SHORT);
                pass.show();
        }
            else{
                //insert details
                Contact c=new Contact();
                c.setName(nameStr);
                c.setUsername(usernameStr);
                c.setEmail(emailStr);
                c.setPassword(passwordStr);
                helper.insertContact(c);
            }
    }
}
}
