package com.example.btth2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import com.example.btth2.models.User;
import com.example.btth2.models.UserRepo;

public class SignUpActivity extends AppCompatActivity {
    private Button btnLogin, btnSignup, btnSignupForm;

    private EditText emailEdt, passwordEdt, confirmPasswordEdt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnLogin = findViewById(R.id.btnLogin);
        btnSignup = findViewById(R.id.btnSignup);
        btnSignupForm = findViewById(R.id.button3);

        emailEdt = findViewById(R.id.editText);
        passwordEdt = findViewById(R.id.editText2);
        confirmPasswordEdt = findViewById(R.id.editText3);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnSignupForm.setOnClickListener(v -> SignUp());
    }

    private void SignUp() {
        if (passwordEdt.getText().toString().equals(confirmPasswordEdt.getText().toString()) && emailEdt.getText().length() > 3) {
            // Đăng ký thành công
            String username = emailEdt.getText().toString();
            String password = passwordEdt.getText().toString();
            User user = new User(username, password);
            UserRepo.userList.add(user);
            Toast.makeText(this, "SignUp success", Toast.LENGTH_SHORT).show();
        } else {
            // Mật khẩu không khớp hoặc email không hợp lệ
            Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show();
        }
    }
}