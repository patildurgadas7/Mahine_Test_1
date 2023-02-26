package com.example.mahine_test_1;

import android.app.Dialog;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.content.Context;


import androidx.annotation.NonNull;
public class CustomDialog  extends Dialog {
    TextView text1, text2;
    RadioButton Radio1, Radio2;
    Context context;
    String string1;
    CheckBox check;

    public CustomDialog(@NonNull Context context, String mainActivityEditText) {
        super(context);
        this.context = context;
        string1 = mainActivityEditText;
        setContentView(R.layout.custome_dialog);
        initViews();
        text1.setText(string1);
        initListener();
    }

    public void initViews() {
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        Radio1 = findViewById(R.id.Radio1);
        Radio2 = findViewById(R.id.Radio2);
        check = findViewById(R.id.check);



    }

    public void initListener() {
        Radio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText(string1.toUpperCase());
            }
        });
        Radio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText(string1.toLowerCase());

            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ReverseString=" ";
                TextView textView = findViewById(R.id.text2);
                String userString = textView.getText().toString();
                char []EnterString = userString.toCharArray();
                for(int count = EnterString.length-1;count >= 0;count--){

                    ReverseString = ReverseString + EnterString[count];
                }
                textView.setText(ReverseString);
            }
        });
    }
}