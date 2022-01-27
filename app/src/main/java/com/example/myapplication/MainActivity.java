package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText inputText;
    TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);

        btn.setOnClickListener(view -> {
            inputText = findViewById(R.id.inputText);
            String textString = inputText.getText().toString();
            tView = findViewById(R.id.textView2);
            tView.setText(textString);
            Toast.makeText(getApplicationContext(), textString , Toast.LENGTH_SHORT).show();
        });
    }
}