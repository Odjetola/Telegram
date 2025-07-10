package org.telegram.ui.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ProfileTabsAdapter extends FragmentStateAdapter {

    public ProfileTabsAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return new DummyFragment(); // Replace with real MediaFragment, etc.
    }

    @Override
    public int getItemCount() {
        return 3; // Media, Voice, Members
    }
}
