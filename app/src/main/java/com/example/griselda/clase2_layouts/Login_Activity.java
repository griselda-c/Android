package com.example.griselda.clase2_layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
    final String USER = "user123";
    final String PASS = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);

        Button login = (Button) findViewById(R.id.boton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText user = (EditText) findViewById(R.id.usuario);
                EditText pass = (EditText) findViewById(R.id.password);
                if(user.getText().toString().trim().equals(USER) && pass.getText().toString().trim().equals(PASS)){
                    Intent intent = new Intent(Login_Activity.this,HomeActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(Login_Activity.this,"Error :(",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
