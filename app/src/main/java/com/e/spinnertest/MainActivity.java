package com.e.spinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
            create the spinner(drop down list) and create an array with three elements.
         */
        Spinner sp = (Spinner) findViewById(R.id.test_spinner);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new
                String[]{"default","size", "color", "caps",});
        sp.setAdapter(aa);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // due to the drop down being Strings, below will get selected item and checks if it equals to string
                Spinner spinner = (Spinner)findViewById(R.id.test_spinner);
                String text = spinner.getSelectedItem().toString();
                TextView test = findViewById(R.id.textView);
                if(text == "default"){
                    test.setTextColor(Color.BLACK);
                    test.setTextSize(18);
                    test.setTypeface(Typeface.create("sans-serif-thin", Typeface.NORMAL));
                    test.setAllCaps(false);
                    test.setBackgroundColor(Color.TRANSPARENT);
                    TextView sizeText = findViewById(R.id.code);
                    sizeText.setText("Code: \n Code will be shown here");
                } else if(text == "size"){
                    test.setTextColor(Color.BLACK);
                    test.setTextSize(30);
                    test.setTypeface(Typeface.create("sans-serif-thin", Typeface.NORMAL));
                    test.setAllCaps(false);
                    test.setBackgroundColor(Color.TRANSPARENT);
                    TextView sizeText = findViewById(R.id.code);
                    sizeText.setText("Code: \n test.setTextSize(30);");
                }else if (text =="color"){
                    test.setTextColor(Color.WHITE);
                    test.setTextSize(18);
                    test.setTypeface(Typeface.create("bold|sans-serif-thin", Typeface.NORMAL));
                    test.setAllCaps(false);
                    test.setBackgroundColor(Color.BLACK);
                    TextView sizeText = findViewById(R.id.code);
                    sizeText.setText("Code: \n test.setTextColor(Color.White) \n test.setBackgroundColor(Color.BLACK);");
                }else if (text == "caps"){
                    test.setTextColor(Color.BLACK);
                    test.setTextSize(18);
                    test.setTypeface(Typeface.create("sans-serif-thin", Typeface.NORMAL));
                    test.setAllCaps(true);
                    test.setBackgroundColor(Color.TRANSPARENT);
                    TextView sizeText = findViewById(R.id.code);
                    sizeText.setText("Code: \n test.setAllCaps(true);");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
}
}
