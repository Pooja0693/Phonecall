package com.example.ideal.phonecall;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edittext1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         edittext1 = (EditText) findViewById(R.id.edittext1);
         button = (Button) findViewById(R.id.button1);
         //SAmple edit

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                String number = edittext1.getText().toString();
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:"+number));
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }


            }
        });

    }
}
