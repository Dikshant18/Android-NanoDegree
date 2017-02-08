package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {
    int quantity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        String m="Total:$"+(quantity*5)+"\n";
        m=m+"ThankYou!!!";
        displayMessage(m);
     //  displayPrice(quantity*5);
        //displayMessage("ThankYou!!!");
    }
    public void increment(View view)
    {

        quantity=quantity+1;
        display(quantity);
    }
    public void decrement(View view)
    {
        if(quantity==0)
            display(0);
        else {
            quantity = quantity - 1;
            display(quantity);
        }
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void displayMessage(String message)
    {
        TextView priceTextView = (TextView)findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}