package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // public String myExtra;
    Button button1;
    public String number1;
    public String number2;
    EditText text1 ,  text2;
    int num1 , num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button3);
        text1 = (EditText)findViewById(R.id.t1);
        text2 = (EditText)findViewById(R.id.t2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number1 = text1.getText().toString();
                number2 = text2.getText().toString();



                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                intent.putExtra("MAIN_EXTRA1" , number1);
                intent.putExtra("MAIN_EXTRA2" , number2);

                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,message,duration);
                toast.show();

                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0 , 0);

            }


        });
//Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
//Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));
//Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();




    }
}