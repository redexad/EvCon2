package com.example.evaluacioncontinua2ayasta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements  NavigationHost{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.interzas_principal, new MenuPrinces())
                    .commit();
        }
    }
    @Override
    public void navigateTo(Fragment fragment, boolean addToBackstack){
        FragmentTransaction transaction = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.interzas_principal, fragment);
        if(addToBackstack){
            transaction.addToBackStack(null);
        }
        transaction.commit();
    }
}