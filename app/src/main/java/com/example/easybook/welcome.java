package com.example.easybook;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

import android.widget.TextView;
//import android.support.v7.widget.Toolbar ;
//import android.support.v7.widget.AppCompatActivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.parse.ParseUser;

public class welcome extends AppCompatActivity {
   // public android.support.v7.widget.Toolbar toolbar;

        private Toolbar toolbar;
    private ViewPager viewPager;
    private TableLayout tableLayout;
    private TabAdapter tabAdapter;
    //TextView find;
    private Button lgout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.userinfo);
    /*toolbar=findViewById(R.id.my_Toolbar);
    setSupportActionBar(toolbar);
    viewPager=findViewById(R.id.viewPager);
    tabAdapter=new TabAdapter(getSupportFragmentManager());
    viewPager.setAdapter(tabAdapter);
   TableLayout tab= findViewById(R.id.tabLayout);
*/


       // find=findViewById(R.id.TXT);
        //find.setText("welcome"+ "  "+ParseUser.getCurrentUser().getUsername());
        //lgout=findViewById(R.id.lgout);
        /*lgout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParseUser.getCurrentUser().logOut();
                finish();
            }
        });

         */
    }
}
