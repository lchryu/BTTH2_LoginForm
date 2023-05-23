package com.example.btth2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.btth2.models.User;
import com.example.btth2.models.UserRepo;

public class LoginActivity extends AppCompatActivity {
    private Button btnLogin, btnSignup, btnLoginForm;
    private EditText emailEdt, passwordEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnSignup = (Button) findViewById(R.id.btnSignup);

        btnLoginForm = findViewById(R.id.button3);
        emailEdt = findViewById(R.id.editText);
        passwordEdt = findViewById(R.id.editText2);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);

            }
        });

        btnLoginForm.setOnClickListener(v -> login());

        populateUsernameFromBundle();
    }

    private void login() {
        String username = emailEdt.getText().toString();
        String password = passwordEdt.getText().toString();

        for (User user : UserRepo.userList) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                // Đăng nhập thành công
                Toast.makeText(this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                // Mở activity mới
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);

                // Kết thúc activity hiện tại
                finish();
            }
        }

        // Không tìm thấy người dùng hoặc thông tin đăng nhập không chính xác
        Toast.makeText(this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
    }
    private void populateUsernameFromBundle() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String username = bundle.getString("username");
            if (username != null) {
                emailEdt.setText(username);
            }
        }
    }

}