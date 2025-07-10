package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import org.telegram.messenger.R;

public class GroupProfileActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_profile);

        TextView groupName = findViewById(R.id.group_name);
        groupName.setText("Group Name Here");
    }
}