package org.m2i.atelier02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    Button btn_add, btn_min, btn_mult, btn_div ;
    TextView result ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btn_add = findViewById(R.id.btn_add);
        btn_min = findViewById(R.id.btn_min);
        btn_div = findViewById(R.id.btn_div);
        btn_mult = findViewById(R.id.btn_mult);
        result = findViewById(R.id.result);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString()); // getters
                int number2 = Integer.parseInt(num2.getText().toString());
                int res = number1 + number2;
                result.setText(String.valueOf(res)); // setters
            }
        });

        btn_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString()); // getters
                int number2 = Integer.parseInt(num2.getText().toString());
                int res = number1 - number2;
                result.setText(String.valueOf(res)); // setters
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString()); // getters
                int number2 = Integer.parseInt(num2.getText().toString());
                if(number2 == 0) {
                    result.setText("Error : Div by 0");
                    return;
                }
                int res = number1 / number2;
                result.setText(String.valueOf(res)); // setters
            }
        });

        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString()); // getters
                int number2 = Integer.parseInt(num2.getText().toString());
                int res = number1 * number2;
                result.setText(String.valueOf(res)); // setters
            }
        });
    }
}