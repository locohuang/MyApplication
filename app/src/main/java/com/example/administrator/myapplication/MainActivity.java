package com.example.administrator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends Activity implements TextWatcher{
    private static final String[] items={"abcd","abcf","ldio","abcefg","abaaee","abciil","ee","dd"};
    private AutoCompleteTextView auto;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.tv);
        auto = (AutoCompleteTextView)findViewById(R.id.auto);
        ArrayAdapter<String> adapter=
                new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,items);
        auto.setAdapter(adapter);
        auto.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        tv.setText(auto.getText());
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
