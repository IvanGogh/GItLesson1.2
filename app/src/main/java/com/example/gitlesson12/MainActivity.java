package com.example.gitlesson12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Vvod = findViewById(R.id.vvod);
        Button button = findViewById(R.id.Button1);
        Switch switch1 = findViewById(R.id.switch1);
        CheckBox checkBox = findViewById(R.id.checkbox);
        ToggleButton tg = findViewById(R.id.tb);
        TextView fin = findViewById(R.id.fin);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fin.setText("Шикарный текст, Бро!");
                String vvod1 = Vvod.getText().toString();


            }

        });


    }

    //Описываем процесс перехода с MainActivity в SecondActivity,
    // который будет происходить при нажатии на нашу кнопку:

    public void Click(View view) {
        //Создаем переход:
        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        //Запускаем его при нажатии:
        startActivity(intent);
    }
}