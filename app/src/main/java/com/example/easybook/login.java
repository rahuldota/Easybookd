package com.example.easybook;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

public class login extends AppCompatActivity {
    private EditText eml,psd;
    private Button lgn2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.logi_n);
        eml=findViewById(R.id.edT1);
        psd=findViewById(R.id.edT2);
        lgn2=findViewById(R.id.lgn2);
        //final ProgressDialog progressDialog=new ProgressDialog(login.this);
      //  progressDialog.setMessage("loging up");
       // progressDialog.show();

        lgn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParseUser.logInInBackground(eml.getText().toString(), psd.getText().toString(), new LogInCallback() {
                    @Override
                    public void done(ParseUser user, ParseException e) {

                        if (user != null && e == null) {
         //                   progressDialog.dismiss();
                            Toast.makeText(login.this, "sucess login", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent(login.this, welcome.class);
                            startActivity(intent);

                        }
                        else
                        {
                            Toast.makeText(login.this,"error account doesn't exist",Toast.LENGTH_LONG).show();
                            eml.setText(null);
                            psd.setText(null);


                        }
                    }
                });

            }
        });


    }
}
