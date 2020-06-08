package com.example.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Milk extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.milk);
    }
    public void gotomain(View view)
    {
        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void cheeseinc(View view) {
        MainActivity.nocheese++;
        displaycheese(MainActivity.nocheese);
    }
    public void cheesedec(View view) {
        if(MainActivity.nocheese!=0)
        {
            MainActivity.nocheese--;
            displaycheese(MainActivity.nocheese);
            // displayPrice(quantity * 5);
        }
    }
    private void displaycheese(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.cheese_quantity);
        quantityTextView.setText("" + number);
    }
    public void paneerinc(View view) {
        MainActivity.nopan++;
        displaypaneer(MainActivity.nopan);
    }
    public void paneerdec(View view) {
        if(MainActivity.nopan!=0)
        {
            MainActivity.nopan--;
            displaypaneer(MainActivity.nopan);
            // displayPrice(quantity * 5);
        }
    }
    private void displaypaneer(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.paneer_quantity);
        quantityTextView.setText("" + number);
    }
    public void yoginc(View view) {
        MainActivity.noyog++;
        displayyog(MainActivity.noyog);
    }
    public void yogdec(View view) {
        if(MainActivity.noyog!=0)
        {
            MainActivity.noyog--;
            displayyog(MainActivity.noyog);
            // displayPrice(quantity * 5);
        }
    }
    private void displayyog(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.yogurt_quantity);
        quantityTextView.setText("" + number);
    }
    public void milkinc(View view) {
        MainActivity.nomilk++;
        displaymilk(MainActivity.nomilk);
    }
    public void milkdec(View view) {
        if(MainActivity.nomilk!=0)
        {
            MainActivity.nomilk--;
            displaymilk(MainActivity.nomilk);
            // displayPrice(quantity * 5);
        }
    }
    private void displaymilk(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.milk_quantity);
        quantityTextView.setText("" + number);
    }
    public void gotoCart(View view)
    {
        Intent i=new Intent(this, Cart.class);
        startActivity(i);
    }
}
