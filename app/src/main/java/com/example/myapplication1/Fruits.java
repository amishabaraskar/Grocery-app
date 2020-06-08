package com.example.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class Fruits extends AppCompatActivity  {
   // public static  int noapples,nograpes,noorange,nopine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruits);
    }
    public void gotomain(View view)
    {
        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void appleinc(View view) {
        MainActivity.noapples++;
        displayapp(MainActivity.noapples);
    }
    public void appledec(View view) {
        if(MainActivity.noapples!=0)
        {
            MainActivity.noapples--;
            displayapp(MainActivity.noapples);
            // displayPrice(quantity * 5);
        }
    }
    private void displayapp(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.apple_quantity);
        quantityTextView.setText("" + number);
    }
    public void orangeinc(View view) {
        MainActivity.noorange++;
        displayapp(MainActivity.noorange);
    }
    public void orangedec(View view) {
        if(MainActivity.noorange!=0)
        {
            MainActivity.noorange--;
            displayapp(MainActivity.noorange);
            // displayPrice(quantity * 5);
        }
    }
    private void displayorange(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.orange_quantity);
        quantityTextView.setText("" + number);
    }
    public void pineappleinc(View view) {
        MainActivity.nopine++;
        displaypine(MainActivity.nopine);
    }
    public void pineappledec(View view) {
        if(MainActivity.nopine!=0)
        {
            MainActivity.nopine--;
            displaypine(MainActivity.nopine);
            // displayPrice(quantity * 5);
        }
    }
    private void displaypine(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.pineapple_quantity);
        quantityTextView.setText("" + number);
    }
    public void grapeinc(View view) {
        MainActivity.nograpes++;
        displayapp(MainActivity.nograpes);
    }
    public void grapedec(View view) {
        if(MainActivity.nograpes!=0)
        {
            MainActivity.nograpes--;
            displayapp(MainActivity.nograpes);
            // displayPrice(quantity * 5);
        }
    }
    private void displaygrape(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.grape_quantity);
        quantityTextView.setText("" + number);
    }
    public void gotoCart(View view)
    {
        Intent i=new Intent(this, Cart.class);
        startActivity(i);
    }
}
