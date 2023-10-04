package com.example.tess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.ClipboardManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button change1,change2,hate,reset,copy;
    TextView message;
    EditText masuk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message =(TextView) findViewById(R.id.text);
        masuk=(EditText) findViewById(R.id.edit);
        change1 =(Button) findViewById(R.id.wangi1);
        change2=(Button) findViewById(R.id.wangi2);
        hate=(Button) findViewById(R.id.hate);
        reset=(Button) findViewById(R.id.reset);
        copy=(Button) findViewById(R.id.copy);


        change1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable hasil1= masuk.getText();
                message.setText(hasil1+" AAAAAAAAA WANGI WANGI WANGI WANGI HU HA HU HA HU HA, aaaah baunya"+ hasil1+"  wangi aku mau nyiumin aroma wanginya"+ hasil1+" AAAAAAAAH ~~ Rambutnya.... aaah rambutnya juga pengen aku elus-elus ~~~~~ AAAAAH"+ hasil1+" MANIS BANGET YAAMPUN. dia JUGA PAKE STOCKING IMUT BANGET AAAAAAAAH"+ hasil1+" LUCCUUUUUUUUUUUUUUU............ GUA BAKAL BAKAR DUIT 12 JUTA RUPIAH BUAT"+hasil1+" AAAAAAAAAAAAAAAAAAAAAAAAAAAAAGH");
            }
        });

        change2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable hasil1= masuk.getText();
                message.setText(hasil1+"..........."+ hasil1+"  AAAAAAAAA WANGI WANGI WANGI WANGI HU HA HU HA HU HA, aaaah baunya" +hasil1+" wangi aku mau nyiumin aroma wanginya"+hasil1+" AAAAAAAAH ~~ Rambutnya.... aaah rambutnya juga pengen aku elus-elus ~~~~~ AAAAAH"+ hasil1+" MANIS BANGET YAAMPUN. dia JUGA PAKE STOCKING IMUT BANGET AAAAAAAAH"+ hasil1);
            }
        });

        hate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable hasil1= masuk.getText();
                message.setText("anjing lu"+hasil1+" ,memek lu ngentod emak lu"+hasil1+" gua entod anjinggggggg"+hasil1+" gua benci banget ama lo,dasar makhluk rendahan bekas romusha hasil budak daendels");
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message.setText("      ");
            }
        });

        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard=(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip=ClipData.newPlainText("message", message.getText().toString());
                clipboard.setPrimaryClip(clip);

                clip.getDescription();
                Toast.makeText(MainActivity.this, "copied", Toast.LENGTH_SHORT).show();
                }
        });




    }
}