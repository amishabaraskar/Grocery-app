package com.example.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.myapplication1.Milk;
import com.example.myapplication1.Vegetables;
import com.example.myapplication1.Fruits;

import android.view.View;
import android.widget.TextView;
import android.content.Intent;

 public class Cart extends AppCompatActivity {
     int flag1 = 0, flag2 = 0, flag3 = 0, flag4 = 0, flag5 = 0, flag6 = 0, flag7 = 0, flag8 = 0, flag9 = 0, flag10 = 0, flag11 = 0, flag12 = 0, totalitems = 0,totalprice=0;
    public static int applep=120,grapep=80,pinep=100,orangep=80,brocp=100,peasp=120,capsicump=60,tomp=80,cheesep=250,yogp=60,panp=300,milkp=80;
     protected void assign(String a, int b,int p) {
         TextView itemTextView;

         TextView noofitems;
         TextView priceofitems;
         if (flag1 == 0) {
             itemTextView = (TextView) findViewById(R.id.item1);
             itemTextView.setText("" + a);
             noofitems = (TextView) findViewById(R.id.no_of_item1);
             noofitems.setText("" + b);
             priceofitems=(TextView) findViewById(R.id.price1);
             priceofitems.setText(""+p);
             flag1 = 1;
             return;
         }
         else if (flag2 == 0) {
             itemTextView = (TextView) findViewById(R.id.item2);
             itemTextView.setText("" + a);
             noofitems = (TextView) findViewById(R.id.no_of_item2);
             noofitems.setText("" + b);
             priceofitems=(TextView) findViewById(R.id.price2);
             priceofitems.setText(""+p);

             flag2 = 1;
             return;
         }
         else if (flag3 == 0) {
             itemTextView = (TextView) findViewById(R.id.item3);
             itemTextView.setText("" + a);
             noofitems = (TextView) findViewById(R.id.no_of_item3);
             noofitems.setText("" + b);
             priceofitems=(TextView) findViewById(R.id.price3);
             priceofitems.setText(""+p);
             flag3 = 1;
             return;
         }
         else if (flag4 == 0) {
             itemTextView = (TextView) findViewById(R.id.item4);
             itemTextView.setText("" + a);
             noofitems = (TextView) findViewById(R.id.no_of_item4);
             noofitems.setText("" + b);
             priceofitems=(TextView) findViewById(R.id.price4);
             priceofitems.setText(""+p);
             flag4 = 1;
             return;
         }
         else if(flag5==0)
         {
             itemTextView=(TextView)findViewById(R.id.item5);
             itemTextView.setText(""+a);
             noofitems = (TextView) findViewById(R.id.no_of_item5);
             noofitems.setText("" + b);
             priceofitems=(TextView) findViewById(R.id.price5);
             priceofitems.setText(""+p);
             flag5 = 1;
             return;

         }
         else if(flag6==0) {
             itemTextView = (TextView) findViewById(R.id.item6);
             itemTextView.setText("" + a);
             noofitems = (TextView) findViewById(R.id.no_of_item6);
             noofitems.setText("" + b);
             priceofitems=(TextView) findViewById(R.id.price6);
             priceofitems.setText(""+p);
             flag6 = 1;
             return;
         }
         else if(flag7==0) {
             itemTextView = (TextView) findViewById(R.id.item7);
             itemTextView.setText("" + a);
             noofitems = (TextView) findViewById(R.id.no_of_item7);
             noofitems.setText("" + b);
             priceofitems=(TextView) findViewById(R.id.price7);
             priceofitems.setText(""+p);
             flag7 = 1;
             return;
         }
         else if(flag8==0) {
             itemTextView = (TextView) findViewById(R.id.item8);
             itemTextView.setText("" + a);
             noofitems = (TextView) findViewById(R.id.no_of_item8);
             noofitems.setText("" + b);
             priceofitems=(TextView) findViewById(R.id.price8);
             priceofitems.setText(""+p);
             flag8 = 1;
             return;

         }
         else if(flag9==0) {
             itemTextView = (TextView) findViewById(R.id.item9);
             itemTextView.setText("" + a);
             noofitems = (TextView) findViewById(R.id.no_of_item9);
             noofitems.setText("" + b);
             priceofitems=(TextView) findViewById(R.id.price9);
             priceofitems.setText(""+p);
             flag9 = 1;
             return;
         }
         else if(flag10==0) {
             itemTextView = (TextView) findViewById(R.id.item10);
             itemTextView.setText("" + a);
             noofitems = (TextView) findViewById(R.id.no_of_item10);
             noofitems.setText("" + b);
             priceofitems=(TextView) findViewById(R.id.price10);
             priceofitems.setText(""+p);
             flag10 = 1;
             return;
         }
         else if(flag11==0) {
             itemTextView = (TextView) findViewById(R.id.item11);
             itemTextView.setText("" + a);
             noofitems = (TextView) findViewById(R.id.no_of_item11);
             noofitems.setText("" + b);
             priceofitems=(TextView) findViewById(R.id.price11);
             priceofitems.setText(""+p);
             flag11 = 1;
             return;
         }
         else if(flag12==0)
         {
               itemTextView = (TextView) findViewById(R.id.item12);
               itemTextView.setText("" + a);
               noofitems = (TextView) findViewById(R.id.no_of_item12);
               noofitems.setText("" + b);
               priceofitems=(TextView) findViewById(R.id.price12);
               priceofitems.setText(""+p);
               flag12 = 1;
               return;
         }
        return;


         
     }

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         String c;
         int p;
         setContentView(R.layout.activity_cart);
//TextView abcd=(TextView) findViewById(R.id.item1);
//abcd.setText(""+MainActivity.nobroc);

         if (MainActivity.noapples != 0) {
             totalitems += MainActivity.noapples;
             c = "Apples";
             p=MainActivity.noapples*applep;
             totalprice+=p;
             assign(c, MainActivity.noapples,p);
         }
         if (MainActivity.nograpes != 0) {
             totalitems += MainActivity.nograpes;
             c = "Grapes";
             p=MainActivity.nograpes*grapep;
             totalprice+=p;
             assign(c, MainActivity.nograpes,p);
         }
         if (MainActivity.nopine != 0) {
             totalitems += MainActivity.nopine;
             c = "Pineapple";
             p=MainActivity.nopine*pinep;
             totalprice+=p;

             assign(c, MainActivity.nopine,p);
         }
         if (MainActivity.noorange != 0) {
             totalitems += MainActivity.noorange;
             c = "Oranges";
             p=MainActivity.noorange*orangep;
             totalprice+=p;

             assign(c, MainActivity.noorange,p);
         }
         if (MainActivity.notom != 0) {
             totalitems += MainActivity.notom;
             c = "Tomatoes";
             p=MainActivity.notom*tomp;
             totalprice+=p;

             assign(c, MainActivity.notom,p);
         }
         if (MainActivity.nopeas != 0) {
             totalitems += MainActivity.nopeas;
             c = "Peas";
             p=MainActivity.nopeas*peasp;
             totalprice+=p;

             assign(c, MainActivity.nopeas,p);
         }
         if (MainActivity.nocap != 0) {
             totalitems += MainActivity.nocap;
             c = "Capsicum";
             p=MainActivity.nocap*capsicump;
             totalprice+=p;
             assign(c, MainActivity.nocap,p);
         }
         if (MainActivity.nobroc != 0) {
             totalitems += MainActivity.nobroc;
             c="Broccoli";
             p=MainActivity.nobroc*brocp;
             totalprice+=p;

             assign(c, MainActivity.nobroc,p);

         }
         if (MainActivity.nomilk != 0) {
             totalitems += MainActivity.nomilk;
             c = "Milk";
             p=MainActivity.nomilk*milkp;
             totalprice+=p;

             assign(c, MainActivity.nomilk,p);
         }
         if (MainActivity.noyog != 0) {
             totalitems += MainActivity.noyog;
             c = "Yogurt";
             p=MainActivity.noyog*yogp;
             totalprice+=p;

             assign(c, MainActivity.noyog,p);
         }
         if (MainActivity.nocheese != 0) {
             totalitems += MainActivity.nocheese;
             c = "Cheese";
             p=MainActivity.nocheese*cheesep;
             totalprice+=p;

             assign(c, MainActivity.nocheese,p);
         }
         if (MainActivity.nopan != 0) {
             totalitems += MainActivity.nopan;
             c = "Paneer";
             p=MainActivity.nopan*panp;
             totalprice+=p;

             assign(c, MainActivity.nopan,p);
         }
        TextView total=(TextView) findViewById(R.id.total_items);
        total.setText(""+totalitems);
         total=(TextView) findViewById(R.id.totalprice);
         total.setText(""+totalprice);
     }


 }
