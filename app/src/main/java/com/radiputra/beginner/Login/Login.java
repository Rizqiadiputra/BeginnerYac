package com.radiputra.beginner.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.radiputra.beginner.Home.Home;
import com.radiputra.beginner.MainActivity;
import com.radiputra.beginner.R;

public class Login extends AppCompatActivity {

    Button btnSignIn;
    EditText edtUser,edtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUser = (EditText) findViewById(R.id.edtUser);
        edtPass = (EditText) findViewById(R.id.edtPass);
        btnSignIn = (Button) findViewById(R.id.btn_login);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtUser.getText().toString().equals("yac") &&
                        edtPass.getText().toString().equals("jaya")){
                    Toast.makeText(Login.this, "Sukses", Toast.LENGTH_SHORT).show();
                    startActivity( new Intent(Login.this, Home.class));
                    finish();
                }else {
                    Toast.makeText(Login.this, "Gagal", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
