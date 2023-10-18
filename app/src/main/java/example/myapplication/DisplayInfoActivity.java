
package example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);

        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView emailTextView = findViewById(R.id.emailTextView);
        TextView phoneTextView = findViewById(R.id.phoneTextView);
        TextView messageTextView = findViewById(R.id.messageTextView);

        Intent intent = getIntent();
        if (intent != null) {
            String name = intent.getStringExtra("name");
            String email = intent.getStringExtra("email");
            String phone = intent.getStringExtra("phone");
            String message = intent.getStringExtra("message");

            nameTextView.setText("Аты-жөні: " + name);
            emailTextView.setText("Оқу деңгейі: " + email);
            phoneTextView.setText("Курсы: " + phone);
            messageTextView.setText("Мамандығы: " + message);
        }
    }
}

