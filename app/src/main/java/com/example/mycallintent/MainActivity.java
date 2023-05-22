package com.example.mycallintent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initListener();

    }

    public void initView() {
        //Getting instance of edittext  button
        editText = findViewById(R.id.editText);

        //Getting instance of button
        button = findViewById(R.id.button);
    }

    public void initListener() {
        // Attach set on click listener to the button for initializing intent
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK,(ContactsContract.Contacts.CONTENT_URI));
                startActivityForResult(intent,1);
//                if (intent.resolveActivity(getPackageManager()) != null) {
//                    startActivity(intent);
//
//                }
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Do you want to make call");
                builder.setCancelable(false);
                builder.setPositiveButton("yes",(DialogInterface.OnClickListener)(dialog,which)->{
                    finish();
                });
                builder.setNegativeButton("No",(DialogInterface.OnClickListener)(dialog,which)->{
                    dialog.cancel();
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });


    }
}