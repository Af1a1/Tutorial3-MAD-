package com.example.tute3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

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

    Button btn;
    EditText num1;
    EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.ok);

        LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.custom_toast,(ViewGroup)
                findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setView(layout);
        toast.show();
    }

    @Override
    protected void onResume(){
        super.onResume();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP | Gravity.LEFT , 0 , 0);

                toast.show();

                num1 = findViewById(R.id.num1);
                num2 = findViewById(R.id.num2);
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Number_1", number1);
                intent.putExtra("Number_2", number2);
                startActivity(intent);
            }
        });
    }

}