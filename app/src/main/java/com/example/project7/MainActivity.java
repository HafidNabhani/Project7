package com.example.project7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // BUTTON OPEN
        Button btnOpen = findViewById(R.id.btn_open);
        btnOpen.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        });

        // ICON TITIK 3
        ImageView btnMenu = findViewById(R.id.btn_menu);
        btnMenu.setOnClickListener(view -> {

            PopupMenu popupMenu = new PopupMenu(MainActivity.this, btnMenu);
            popupMenu.getMenuInflater().inflate(R.menu.menu_header, popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(item -> {
                int id = item.getItemId();

                if (id == R.id.menu_1) {
                    Toast.makeText(MainActivity.this, "Menu 1 dipilih", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (id == R.id.menu_2) {
                    Toast.makeText(MainActivity.this, "Menu 2 dipilih", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (id == R.id.menu_3) {
                    Toast.makeText(MainActivity.this, "Menu 3 dipilih", Toast.LENGTH_SHORT).show();
                    return true;
                }

                return false;
            });

            popupMenu.show();
        });
    }
}
