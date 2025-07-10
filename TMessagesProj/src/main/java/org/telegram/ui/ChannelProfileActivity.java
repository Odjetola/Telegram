package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import org.telegram.messenger.R;

public class ChannelProfileActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channel_profile);

        TextView channelName = findViewById(R.id.channel_name);
        channelName.setText("Channel Broadcast");
    }
}