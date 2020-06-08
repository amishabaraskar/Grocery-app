

package com.example.myapplication1;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;

//import com.example.android.myapplication1.R;


public class MainActivity extends AppCompatActivity {


    public static  int noapples=0,nograpes=0,noorange=0,nopine=0,nobroc=0,nopeas=0,nocap=0,notom=0,nocheese=0,noyog=0,nopan=0,nomilk=0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openFruits(View view){
        Intent i=new Intent(this, Fruits.class);
        startActivity(i);
    }
    public void openMilk(View view){
        Intent i=new Intent(this, Milk.class);
        startActivity(i);
    }
    public void openVegetables(View view){
        Intent i=new Intent(this, Vegetables.class);
        startActivity(i);
    }


}
