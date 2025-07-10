package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.telegram.messenger.R;

public class UserProfileActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        ImageView verifiedIcon = findViewById(R.id.verified_icon);
        TextView userName = findViewById(R.id.user_name);
        userName.setText("Your Name Here");
    }
}