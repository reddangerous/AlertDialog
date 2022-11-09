package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnAlertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAlertDialog = (Button) findViewById(R.id.btn_alert_dialog);
        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMyAlertDialog(MainActivity.this);
            }
        });
    }



    private void showMyAlertDialog(MainActivity mainActivity) {
        new AlertDialog.Builder(mainActivity)
                //Set the message and title from the strings.xml file
//.setTitle(R.string.dialog_title)
//.setMessage(R.string.dialog_message)
                //Set title and message manually and performing action on button click
                .setTitle("Terminator")
                .setMessage("Do you want to close this application ?")
//.setIcon(R.drawable.ic_menu_end)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Action for 'NO' Button
                        dialog.cancel();
                    }
                })
                //Creating dialog box
                .create()
                //make the dialog to be visible
                .show();
    }//end showMyAlertDialog
}
