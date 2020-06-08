package com.example.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Vegetables extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vegetables);
    }
    public void gotomain(View view)
    {
        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void brocinc(View view) {
        MainActivity.nobroc++;
        displaybroc(MainActivity.nobroc);
    }
    public void brocdec(View view) {
        if(MainActivity.nobroc!=0)
        {
            MainActivity.nobroc--;
            displaybroc(MainActivity.nobroc);
            // displayPrice(quantity * 5);
        }
    }
    private void displaybroc(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.broccoli_quantity);
        quantityTextView.setText("" + number);
    }
    public void capinc(View view) {
        MainActivity.nocap++;
        displaycap(MainActivity.nocap);
    }
    public void capdec(View view) {
        if(MainActivity.nocap!=0)
        {
            MainActivity.nocap--;
            displaycap(MainActivity.nocap);
            // displayPrice(quantity * 5);
        }
    }
    private void displaycap(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.capsicum_quantity);
        quantityTextView.setText("" + number);
    }
    public void peasinc(View view) {
        MainActivity.nopeas++;
        displaypeas(MainActivity.nopeas);
    }
    public void peasdec(View view) {
        if(MainActivity.nopeas!=0)
        {
            MainActivity.nopeas--;
            displaypeas(MainActivity.nopeas);
            // displayPrice(quantity * 5);
        }
    }
    private void displaypeas(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.peas_quantity);
        quantityTextView.setText("" + number);
    }
    public void tominc(View view) {
        MainActivity.notom++;
        displaytom(MainActivity.notom);
    }
    public void tomdec(View view) {
        if(MainActivity.notom!=0)
        {
            MainActivity.notom--;
            displaytom(MainActivity.notom);
            // displayPrice(quantity * 5);
        }
    }
    private void displaytom(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.tomato_quantity);
        quantityTextView.setText("" + number);
    }
    public void gotoCart(View view)
    {
        Intent i=new Intent(this, Cart.class);
        startActivity(i);
    }
}
