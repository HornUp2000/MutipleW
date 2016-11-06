package com.vogella.android.mutiplew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Bundle b = getIntent().getExtras();
        String buf = b.getString("Web");

        TextView myTV = (TextView)findViewById(R.id.tv);
        WebView myWV = (WebView)findViewById(R.id.wv);
        myTV.setText(buf);
        myWV.loadUrl(buf);

        Button bReturn = (Button)findViewById(R.id.bWebReturn);

        bReturn.setOnClickListener(returnM);
    }

    View.OnClickListener returnM = new View.OnClickListener() {
        public void onClick(View v) {
            Intent myReturn = new Intent(v.getContext(), MainActivity.class);
            startActivity(myReturn);
        }
    };

}
