package com.example.evaluacioncontinua2ayasta;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;



public class MenuPrinces extends Fragment{
    private Button loginButton;
    @Override
    public View onCreateView(
        @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.menu_princi, container, false);
        loginButton =  view.findViewById(R.id.button_login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((NavigationHost) getActivity()).navigateTo(new LoginMenu(),false);
            }
        });
        return view;
        
        }


    }

