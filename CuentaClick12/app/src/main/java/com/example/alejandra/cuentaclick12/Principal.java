package com.example.alejandra.cuentaclick12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    int clicks = 0;
    int clicks1 = 0;
    int clicks2 = 0;
    int clicks3 = 0;
    int clicks4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final Button boton1 = (Button)findViewById(R.id.btn1);

        final Button boton2 = (Button)findViewById(R.id.btn2);

        final EditText edit1 = (EditText)findViewById(R.id.txt1);
        final TextView text2=(TextView)findViewById(R.id.lbl2);

        final EditText edit2 = (EditText)findViewById(R.id.txt2);
        final TextView text1=(TextView)findViewById(R.id.lbl1);

        final Button boton5 = (Button)findViewById(R.id.btn5);
        boton1.setText("No has pulsado el boton");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks++;
                boton1.setText("Has pulsado el boton " + clicks + " veces");
            }
        });
        boton2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                clicks1++;
                boton2.setText("Has pulsado el boton " + clicks1 + " veces");
                return true;
            }
        });
        edit1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    clicks2++;
                    text2.setText(" Has pulsado el boton " + clicks2 + " veces");
                }
            }
        });
        edit2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_0)) {
                    clicks3++;
                    text1.setText("Has pulsado la tecla 0 " + clicks3 + " veces");
                    //return true;
                }
                return true;
            }
        });
        boton5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                clicks4++;
                boton5.setText("Has pulsado el boton " + clicks4 + " veces");
                return false;
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
