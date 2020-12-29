package com.example.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Float.*;

public class MainActivity extends AppCompatActivity {
    private TextView t1;

    private double first;
    private double second;
    private String result;

    boolean add=false,sub=false,multi=false,div=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        t1 = (TextView) findViewById(R.id.textView);

    }

    public void one(View view) {
        t1.setText(t1.getText()+"1");
    }

    public void two(View view) {
        t1.setText(t1.getText()+"2");
    }

    public void three(View view) {
        t1.setText(t1.getText()+"3");
    }

    public void four(View view) {
        t1.setText(t1.getText()+"4");
    }

    public void five(View view) {
        t1.setText(t1.getText()+"5");
    }

    public void six(View view) {
        t1.setText(t1.getText()+"6");
    }

    public void seven(View view) {
        t1.setText(t1.getText()+"7");
    }

    public void eight(View view) {
        t1.setText(t1.getText()+"8");
    }

    public void nine(View view) {
        t1.setText(t1.getText()+"9");
    }

    public void zero(View view) {
        t1.setText(t1.getText()+"0");
    }

    public void dot(View view) {
        t1.setText(t1.getText()+".");
    }

    public void plus(View view) {

      try {
          first=Double.parseDouble(t1.getText().toString());
          add=true;
          t1.setText(null);
      }
      catch (Exception e)
      {
          Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
      }
    }

    public void minus(View view) {

        try {
            first=Double.parseDouble(t1.getText().toString());
            sub=true;
            t1.setText(null);
        }catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
        }
    }

    public void multiplication(View view) {

        try {
            first=Double.parseDouble(t1.getText().toString());
            multi=true;
            t1.setText(null);
        }catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
        }
    }

    public void division(View view) {

        try {
            first=Double.parseDouble(t1.getText().toString());
            div=true;
            t1.setText(null);
        }catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
        }
    }

    public void equal(View view) {
        if(add)
        {

            try {
                second=Double.parseDouble(t1.getText().toString());
                result=String.valueOf((first+second));
                t1.setText(result);
                add = false;
            }catch (Exception e)
            {
                Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
            }
        }
        if(sub)
        {

            try {
                second=Double.parseDouble(t1.getText().toString());
                result=String.valueOf((first-second));
                t1.setText(result);
                sub = false;
            }catch (Exception e)
            {
                Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
            }
        }
        if(multi)
        {

            try {
                second=Double.parseDouble(t1.getText().toString());
                result=String.valueOf((first*second));
                t1.setText(result);
                multi = false;
            }catch (Exception e)
            {
                Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
            }
        }
        if(div)
        {

           try {
               second=Double.parseDouble(t1.getText().toString());
               result=String.valueOf((first/second));
               t1.setText(result);
                div=false;
           }
           catch (Exception e)
           {
               Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
           }
        }

    }

    public void clear(View view) {
        try{
            t1.setText(null);
        }
        catch (Exception e)
        {
          Toast.makeText(getApplicationContext(),"Enter value",Toast.LENGTH_LONG).show();
        }
    }
}