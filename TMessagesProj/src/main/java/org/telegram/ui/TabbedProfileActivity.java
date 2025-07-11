
package org.telegram.ui;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import org.telegram.messenger.R;

public class TabbedProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed_profile);

        TabLayout tabLayout = findViewById(R.id.profile_tabs);
        ViewPager2 viewPager = findViewById(R.id.profile_viewpager);

        viewPager.setAdapter(new FragmentStateAdapter(this) {
            @NonNull
            @Override
            public Fragment createFragment(int position) {
                return new DummyTabFragment(); // You can replace with MediaTab, GiftTab, etc.
            }

            @Override
            public int getItemCount() {
                return 3;
            }
        });

        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 0: tab.setText("Media"); break;
                        case 1: tab.setText("Links"); break;
                        case 2: tab.setText("Gifts"); break;
                    }
                }).attach();
    }
}
