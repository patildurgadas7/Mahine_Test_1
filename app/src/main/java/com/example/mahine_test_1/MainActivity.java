package com.example.mahine_test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtUsername;
    Button btn1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 =findViewById(R.id.btn1);
        initializeListeners();
        initializeViews();
    }

    private void initializeViews() {
        edtUsername = findViewById(R.id.edtUsername);
        btn1 = findViewById(R.id.btn1);
    }

    private void initializeListeners() {
        btn1.setOnClickListener(View->{CustomDialog customDialog = new CustomDialog(this,edtUsername.getText().toString());
            customDialog.show();
        });
    }
}
