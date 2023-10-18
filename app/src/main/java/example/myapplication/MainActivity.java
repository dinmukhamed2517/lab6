package example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button btn = findViewById(R.id.btn);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        btn.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                showInfoActivity(view);
//            }
//        });
    }

    public void showInfoActivity(View view) {
        Intent intent = new Intent(this, DisplayInfoActivity.class);

        // Pass data to the new activity
        EditText nameEditText = findViewById(R.id.editTextName);
        EditText emailEditText = findViewById(R.id.editTextEmail);
        EditText phoneEditText = findViewById(R.id.editTextPhone);
        EditText messageEditText = findViewById(R.id.editTextMessage);

        String name = nameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String phone = phoneEditText.getText().toString();
        String message = messageEditText.getText().toString();

        intent.putExtra("name", name);
        intent.putExtra("email", email);
        intent.putExtra("phone", phone);
        intent.putExtra("message", message);

        startActivity(intent);
    }

}