package com.example.android.score_count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.score_count.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int n=0;
    int m=0;
    public void addthree(View view)
    {
        n=n+3;
        display(n);
    }
    public void addtwo(View view)
    {
        n=n+2;
        display(n);
    }
    public void addone(View view)
    {
        n=n+1;
        display(n);
    }
    public void addthree3(View view)
    {
        m=m+3;
        display1(m);
    }
    public void addtwo2(View view)
    {
        m=m+2;
        display1(m);
    }
    public void addone1(View view)
    {
        m=m+1;
        display1(m);
    }
    private void display(int n)
    {
        TextView t1=(TextView) findViewById(R.id.score);
        t1.setText(""+n);
    }
    private void display1(int m)
    {
        TextView t1=(TextView) findViewById(R.id.score1);
        t1.setText(""+m);
    }
    public void reset(View view)
    {
        TextView t1=(TextView) findViewById(R.id.empty);
        t1.setText("");
        m=0;
        n=0;
        display(n);
        display1(m);
    }
    public void result(View view)
    {
        String str;
        TextView t2=(TextView) findViewById(R.id.empty);
        if(n>m)
        {
            str="Hurray!!"+"\n"+"Team A has won with "+n+" points.";
            t2.setText(str);
        }
        else if(m>n)
        {
            str="Hurray!!"+"\n"+"Team B has won with "+m+" points.";
            t2.setText(str);
        }
        else if(m==n)
        {
            if(n==0&&m==0) {
                str = "Score is 0 for both the teams!!";
                t2.setText(str);
            }
            else if(n!=0&&m!=0)
            {
                str = "There's a Tie!!";
                t2.setText(str);
            }
        }
        n=0;
        m=0;
        display(n);
        display1(m);

    }

}
