package com.example.mycallintent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class DialogIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_intent);

       // AlertDialog.Builder builder = new AlertDialog.Builder(DialogIntent.this);
      // builder.setMessage("Do you want to make call");
      //builder.setCancelable(false);
     //   builder.setPositiveButton("yes",(DialogInterface.OnClickListener)(dialog,which)->{
     //       finish();
      //  });
      //  builder.setNegativeButton("No",(DialogInterface.OnClickListener)(dialog,which)->{
      //     dialog.cancel();
     //  });
     //  AlertDialog alertDialog = builder.create();
     //   alertDialog.show();

    }
}