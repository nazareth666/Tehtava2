package com.example.tehtava2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

        findViewById(R.id.button_center).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Button btn2 = findViewById(R.id.button_iso);
                Button btn3 = findViewById(R.id.button_pieni);

                if(btn2.isEnabled() && btn3.isEnabled()){
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                }
                else {
                    btn2.setEnabled(true);
                    btn3.setEnabled(true);
                }
            }
        });
        findViewById(R.id.button_pieni).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imgView = findViewById(R.id.imageView);
                imgView.setVisibility(View.INVISIBLE);
            }
        });

        findViewById(R.id.button_iso).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ImageView imgView = findViewById(R.id.imageView);
                imgView.setVisibility(View.VISIBLE);
                return false;
            }
        });
    }



        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
