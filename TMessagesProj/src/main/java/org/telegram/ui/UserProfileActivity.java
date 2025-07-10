package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.palette.graphics.Palette;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import org.telegram.ui.adapters.ProfileTabsAdapter;
import java.util.HashMap;
import java.util.Map;

public class UserProfileActivity extends AppCompatActivity {

    private CollapsingToolbarLayout collapsingToolbar;
    private AppBarLayout appBarLayout;
    private ImageView headerImage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        appBarLayout = findViewById(R.id.appBarLayout);
        collapsingToolbar = findViewById(R.id.collapsingToolbar);
        headerImage = findViewById(R.id.headerImage);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager2 viewPager = findViewById(R.id.viewPager);

        ProfileTabsAdapter adapter = new ProfileTabsAdapter(this);
        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager,
            (tab, position) -> {
                if (position == 0) tab.setText("Media");
                else if (position == 1) tab.setText("Voice");
                else tab.setText("Members");
            }).attach();

        appBarLayout.addOnOffsetChangedListener((appBarLayout, verticalOffset) -> {
            if (Math.abs(verticalOffset) == appBarLayout.getTotalScrollRange()) {
                collapsingToolbar.setTitle("User Name");
            } else if (verticalOffset == 0) {
                collapsingToolbar.setTitle("");
            }
        });

        headerImage.setImageResource(R.drawable.avatar_sample); // Sample avatar
        headerImage.post(() -> {
            headerImage.buildDrawingCache();
            Bitmap bmp = headerImage.getDrawingCache();
            Palette.from(bmp).generate(palette -> {
                int color = palette.getVibrantColor(Color.BLUE);
                collapsingToolbar.setContentScrimColor(color);
            });
        });
    }
}
