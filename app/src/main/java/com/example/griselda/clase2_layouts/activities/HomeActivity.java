package com.example.griselda.clase2_layouts.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.griselda.clase2_layouts.R;
import com.example.griselda.clase2_layouts.models.Usuario;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();
        Usuario usuario = (Usuario) intent.getSerializableExtra("user");
        TextView nombre = (TextView) findViewById(R.id.username);
        TextView apellido = (TextView) findViewById(R.id.apellido);
        TextView dni = (TextView) findViewById(R.id.dni);
        nombre.setText(usuario.getNombre());
        apellido.setText(usuario.getApellido());
        dni.setText(usuario.getDni());
    }
}
