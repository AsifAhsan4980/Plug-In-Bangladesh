package com.example.pluginbangladesh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends AppCompatActivity {
    Button sin, lin, skip;
    EditText email,password;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        sin = (Button)findViewById(R.id.sin);
        lin = (Button)findViewById(R.id.lin);
        //skip = (Button)findViewById(R.id.skip);
        email = (EditText) findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);

        //skip.setOnClickListener(new View.OnClickListener() {
           //@Override
        //  public void onClick(View v) {
              // startActivity(new Intent(SignupActivity.this, HomeActivity.class));
           // }
       // });

        lin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignupActivity.this,LoginActivity.class));
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eemail = email.getText().toString();
                String pass = password.getText().toString();
                if (eemail.isEmpty()){
                    email.setError("Please enter your email id");
                    email.requestFocus();
                }
                else if (pass.isEmpty()){
                    password.setError("Please enter a password");
                    password.requestFocus();
                }
                else if (!eemail.isEmpty() && !pass.isEmpty()){
                    firebaseAuth.createUserWithEmailAndPassword(eemail,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()){
                                Toast.makeText(SignupActivity.this, "Sign Up Failed", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                Toast.makeText(SignupActivity.this, "Sign up Successful", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(SignupActivity.this,HomeActivity.class));
                            }
                        }
                    });
                }

            }
        });
    }
}
