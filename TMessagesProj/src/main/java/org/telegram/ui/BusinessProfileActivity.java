package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.R;

public class BusinessProfileActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_profile);

        ImageView businessIcon = findViewById(R.id.business_icon);
        TextView businessName = findViewById(R.id.business_name);
        businessName.setText("Business Page");
    }
}