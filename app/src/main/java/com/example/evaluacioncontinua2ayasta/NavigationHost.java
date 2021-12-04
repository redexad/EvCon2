package com.example.evaluacioncontinua2ayasta;

import androidx.fragment.app.Fragment;

public interface NavigationHost {
    void navigateTo(Fragment fragment, boolean addToBackStack);
}