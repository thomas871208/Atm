package com.tts.atm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText ed_username;
    EditText ed_password;
    String username;
    String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

public void login(View view){
    ed_username = findViewById(R.id.ed_username);
    ed_password = findViewById(R.id.ed_password);
    username = ed_username.getText().toString();
    password = ed_password.getText().toString();
        if("Jack".equals(username)&&"1234".equals(password)){
            setResult(RESULT_OK);
            finish();
        }else {
            new AlertDialog.Builder(this)
                    .setTitle("登入訊息")
                    .setMessage("登入失敗")
                    .setPositiveButton("OK",null)
                    .show();

        }
}

}
