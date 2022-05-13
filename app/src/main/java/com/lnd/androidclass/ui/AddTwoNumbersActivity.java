package com.lnd.androidclass.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.lnd.androidclass.R;

public class AddTwoNumbersActivity extends AppCompatActivity {

    EditText et_firstNumber,et_SecondNumber;
    TextView tv_result;
    Button bt_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_two_numbers);

        et_firstNumber = findViewById(R.id.et_first_num);
        et_SecondNumber = findViewById(R.id.et_second_num);
        tv_result = findViewById(R.id.tv_result);
        bt_add = findViewById(R.id.bt_add);

        bt_add.setOnClickListener(view -> {
            if(validations()) {
                tv_result.setText(String.valueOf(Integer.parseInt(et_firstNumber.getText().toString())
                        + Integer.parseInt(et_SecondNumber.getText().toString())));
            }else{
                Toast.makeText(this,"Please enter number",Toast.LENGTH_SHORT).show();
            }
        });

    }

    private boolean validations() {
        if(et_firstNumber.getText().toString().length()==0){
            return false;
        }else if(et_SecondNumber.getText().toString().length()==0){
            return false;
        }
        return true;
    }

}