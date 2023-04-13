package com.example.anamnesev1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private AnamnaseProcess anamnese = new AnamnaseProcess();
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
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.rbmasc:
                if (checked)
                    anamnese.feedCase1(true);
                    anamnese.feedCase2(true);
                break;
            case R.id.rbfem:
                if (checked)
                    anamnese.feedCase1(true);
                    anamnese.feedCase2(true);
                break;
            case R.id.rbm60:
                if(checked)
                    anamnese.feedCase1(true);
                break;
            case R.id.rb2040:
                if (checked)
                    anamnese.feedCase2(true);
                break;
            case R.id.radioButton13:
                if(checked)
                    anamnese.feedCase1(true);
                break;
            case R.id.radioButton14:
                if(checked)
                    anamnese.feedCase1(true);
                break;
            case R.id.radioButton25:
                if(checked)
                    anamnese.feedCase1(true);
                break;
            case R.id.radioButton24:
                if (checked)
                    anamnese.feedCase1(true);
                break;
            case R.id.radioButton10:
                if (checked)
                    anamnese.feedCase2(true);
                break;
            case R.id.radioButton11:
                if (checked)
                    anamnese.feedCase2(true);
                break;
        }
    }

    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()){
            case R.id.levantarpeso:
                if (checked)
                    anamnese.feedCase1(true);
                break;
            case R.id.cbpai:
                if (checked)
                    anamnese.feedCase1(true);
                break;
            case R.id.cbmae:
                if (checked)
                    anamnese.feedCase1(true);
                break;
            case R.id.cbcoracao:
                if (checked)
                    anamnese.feedCase1(true);
                break;
            case R.id.cbpressart:
                if (checked)
                    anamnese.feedCase1(true);
                break;
            case R.id.caminhar:
                if (checked)
                    anamnese.feedCase2(true);
                break;
            case R.id.cbavo:
                if (checked)
                    anamnese.feedCase2(true);
                break;
            case R.id.cbproblemasmusc:
                if (checked)
                    anamnese.feedCase2(true);
                break;
        }
    }

    public void execButton(View view){
        int idade = Integer.parseInt(this.idade.getText().toString());

        mensagem = anamnese.processReturn(idade);

        result.setText(mensagem);
    }

}