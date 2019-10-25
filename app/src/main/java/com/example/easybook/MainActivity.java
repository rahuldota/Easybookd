package com.example.easybook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;
import com.shashank.sony.fancytoastlib.FancyToast;

public class MainActivity extends AppCompatActivity {
     private EditText edt1,edt2,edt3;
    private Button signup,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //ParseObject signup;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            signup=findViewById(R.id.signup);
            signup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ParseUser appuser=new ParseUser();
                    edt1=findViewById(R.id.edt1);
                    appuser.setUsername(edt1.getText().toString());
                    edt2=findViewById(R.id.edt2);
                    appuser.setEmail(edt2.getText().toString());
                    edt3=findViewById(R.id.edt3);
                    appuser.setPassword(edt3.getText().toString());
                    final ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
                    progressDialog.setMessage("signing up"+ edt1.getText().toString());
                    progressDialog.show();
                    appuser.signUpInBackground(new SignUpCallback() {
                        @Override
                        public void done(ParseException e) {
                            if(e==null)
                            {

                                Toast.makeText(MainActivity.this,"success signup",Toast.LENGTH_LONG).show();
                                progressDialog.dismiss();
                                Intent intent=new Intent(MainActivity.this,welcome.class);
                                startActivity(intent);

                            }
                            else
                            {

                                Toast.makeText(MainActivity.this,"user already exist",Toast.LENGTH_LONG).show();
                                progressDialog.dismiss();
                            }
                        }

                    });

                }
            });
            login=findViewById(R.id.lgn);
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MainActivity.this,login.class);
                    startActivity(intent);
                }
            });
        //edt1.setText(null);
        //edt2.setText(null);
        //edt3.setText(null);
   /* public void ButtonIsClick(View view)
    {
         ParseObject signup=new ParseObject("Signup");
         //ParseObject amit=new ParseObject("Amit");
        /* amit.put("dota",2);
         amit.saveInBackground(new SaveCallback() {
             @Override
             public void done(ParseException e) {
                 if (e==null)
                 {
                     FancyToast.makeText(MainActivity.this,"succesfully saved to server",FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();

                 }
                 else
                 {

                     Toast.makeText(MainActivity.this,"amitis not saved",Toast.LENGTH_LONG).show();
                 }
             }
         });
        */
     /* TextView error=findViewById(R.id.error);

        error.setText("");
        EditText edt1=findViewById(R.id.edt1);
        Log.i("name", edt1.getText().toString());
        int n=edt1.getText().toString().length();
        String word=edt1.getText().toString();
        int index;
        char[] wordary=word.toCharArray();
        Log.i("testt",wordary[2]+"");
      for(index=n-1;index>=0;index--)
        {
            //int j=Integer.parseInt(wordary[index]);
            //Log.i("runn",wordary[index]+"" );
            //int j=Integer.getInteger(wordary[index]);
            char m=wordary[index];
            Log.i("jamm",m+"");

            if(m>='a' && m<='z' || m>='A' && m<='Z' )
            {

            }
             else
                {
                Log.i("jam",m+"");
                TextView error1=findViewById(R.id.error);
                error1.setText("error");

            }*/
        //Log.i("jam",j+"");
            /*if(Integer.)
            {
                Log.i("enter" ,"yss we enter ");

            }*/
           /* if((Integer.parseInt(wordary[index]+""))>=0 && (Integer.parseInt(wordary[index]+""))<=9)
            {
                Log.i("run", "it runs ");
                TextView error1=findViewById(R.id.error);
                error1.setText("error");


          }*/

        //}
        //if(n>3 && )


        //signup.put("name",edt1.getText().toString());
        //Log.i("string", n+"");
        // signup.put("africa",3);
        //edt2=findViewById(R.id.edt2);

        //signup.put("identity",edt2.getText().toString());
        //edt6=findViewById(R.id.edt6);
        //signup.put("pasword",edt6.getText().toString());
        //edt2=findViewById(R.id.edt2);
        //Log.i("id", edt2.getText().toString());
        // signup.put("id",edt2.getText().toString());

        /*signup.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if(e==null)
                {
                    FancyToast.makeText(MainActivity.this,"succesfully saved to server",FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();

                }
                else
                {
                    FancyToast.makeText(MainActivity.this,"unsuccesful do nots saved to server",FancyToast.LENGTH_LONG,FancyToast.WARNING,true).show();
                }
            }
        });*/

        // EditText edt3=findViewById(R.id.edt3);

      /*  Log.i("age",edt3.getText().toString());
        signup.put("age",edt3.getText().toString());
        EditText edt4=findViewById(R.id.edt4);
        Log.i("gy",edt4.getText().toString());
        signup.put("graduation_year",edt4.getText().toString());
        EditText edt5=findViewById(R.id.edt5);
        Log.i("branch",edt5.getText().toString());
       signup.put("branch",edt5.getText().toString());

        EditText edt6=findViewById(R.id.edt6);
       appuser.get
        Log.i("pasword", edt6.getText().toString());
        signup.put("pasword",edt6.getText().toString());
        signup.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if(e==null)
                {
                    FancyToast.makeText(MainActivity.this,"succesfully saved to server",FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show();

                }
                else
                {
                    FancyToast.makeText(MainActivity.this,"unsuccesful do nots saved to server",FancyToast.LENGTH_LONG,FancyToast.WARNING,true).show();
                }
            }
        });

       */


        //edt3.setText(null);
        //edt4.setText(null);
        //edt5.setText(null);
        //edt6.setText(null);

    }    //Toast.makeText(MainActivity.this,"DATA SAVED- "+edt1.getText().toString()+" ,"+edt2.getText().toString()+" ,"+edt3.getText().toString()+" ,"+edt4.getText().toString()+" ,"+edt5.getText().toString()+" ,"+edt6.getText().toString(),Toast.LENGTH_LONG).show();

    }


