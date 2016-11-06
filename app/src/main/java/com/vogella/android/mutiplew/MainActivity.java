package com.vogella.android.mutiplew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bWeb = (Button)findViewById(R.id.bWeb);
        Button bText = (Button)findViewById(R.id.bText);
        EditText eT = (EditText)findViewById(R.id.editT);

        bWeb.setOnClickListener(openWeb);
        bText.setOnClickListener(openText);
    }

    View.OnClickListener openWeb = new View.OnClickListener() {
        public void onClick(View v) {
            EditText eT = (EditText)findViewById(R.id.editT);
            String buf = eT.getText().toString();
            Bundle b = new Bundle();

            b.putString("Web", buf);

            Intent myWeb = new Intent(v.getContext(), WebActivity.class);
            myWeb.putExtras(b);
            startActivity(myWeb);
        }
    };

    View.OnClickListener openText = new View.OnClickListener() {
        public void onClick(View v) {
            EditText eT = (EditText)findViewById(R.id.editT);
            String buf = eT.getText().toString();
            Bundle b = new Bundle();

            b.putString("Text", buf);

            Intent myText = new Intent(v.getContext(), TextActivity.class);
            myText.putExtras(b);
            startActivity(myText);
        }
    };
}
