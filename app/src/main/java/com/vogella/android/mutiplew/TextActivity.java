package com.vogella.android.mutiplew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        Bundle b = getIntent().getExtras();
        String buf = b.getString("Text");

        EditText et = (EditText)findViewById(R.id.editText);
        et.setText(buf);

        Button bReturn = (Button)findViewById(R.id.bTextReturn);

        bReturn.setOnClickListener(returnM);
    }

    View.OnClickListener returnM = new View.OnClickListener() {
        public void onClick(View v) {
            Intent myReturn = new Intent(v.getContext(), MainActivity.class);
            startActivity(myReturn);
        }
    };
}
