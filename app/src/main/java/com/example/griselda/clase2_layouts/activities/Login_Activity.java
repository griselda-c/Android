package com.example.griselda.clase2_layouts.activities;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.griselda.clase2_layouts.R;
import com.example.griselda.clase2_layouts.models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Login_Activity extends AppCompatActivity {
    final String USER = "user123";
    final String PASS = "123";

    final List<Usuario> usuarios = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        Button login = (Button) findViewById(R.id.boton);

        usuarios.add(new Usuario("Yayita", "Garcia", "yayita", "39.000.100"));
        usuarios.add(new Usuario("Pepito", "Gonzalez", "pepito", "39.000.101"));
        usuarios.add(new Usuario("Pepe", "Perez", "pepe", "39.000.110"));
        usuarios.add(new Usuario("Juan", "Lopez", "juan", "39.000.111"));
        usuarios.add(new Usuario("Maria", "Baez", "maria", "39.100.111"));

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText user = (EditText) findViewById(R.id.usuario);
                EditText pass = (EditText) findViewById(R.id.password);

                Usuario usuario = buscarUsuario(user.getText().toString(), pass.getText().toString());

                if (usuario != null) {
                    Intent intent = new Intent(Login_Activity.this, HomeActivity.class);
                    intent.putExtra("user", usuario);
                    startActivity(intent);
                } else {
                    Toast.makeText(Login_Activity.this, "Error :(", Toast.LENGTH_LONG).show();
                }

            }
        });


    }

    public @Nullable Usuario buscarUsuario(String nombre, String password) {

        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equalsIgnoreCase(nombre) && usuario.getPassword().equals(password)) {
                return usuario;
            }

        }
        return null;
    }

}
