package com.example.anamnesev1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private AnamnaseProcess anamnese;
    private String mensagem;

    private EditText idade;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.idade = findViewById(R.id.idade);
        this.result = findViewById(R.id.result);

    }

    public void onRadioButtonClicked(View view){

    }

    public void onCheckboxClicked(View view){

    }

}