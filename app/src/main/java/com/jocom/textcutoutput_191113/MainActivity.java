package com.jocom.textcutoutput_191113;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText et;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        btn = findViewById(R.id.btn);
        et = findViewById(R.id.et);

    }

    public void clickBtn(View view) {

        String abc = et.getText().toString();

        if (abc.length() > 4){
            tv.setText(abc.substring(0, 5));
    }
        else{
            Toast.makeText(this, "글자를 5자 이상 입력하세요. ^^", Toast.LENGTH_SHORT).show();
        }

    }
}

