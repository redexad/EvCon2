package com.example.evaluacioncontinua2ayasta;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginMenu extends Fragment{
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.login_menu, container, false);
        final TextInputLayout passTextInput = view.findViewById(R.id.text_pass);
        final TextInputEditText passwordTextEdit = view.findViewById(R.id.edit_pass);
        MaterialButton ingreButton = view.findViewById(R.id.button_loginnow);
        ingreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPasswordValid(passwordTextEdit.getText())){
                    passTextInput.setError(getString(R.string.pass_error));
                }else{
                    passTextInput.setError(null);
                }
            }
        });

        return view;
    }
    private boolean isPasswordValid(@Nullable Editable text){
        return text!=null && text.length() >= 6;
    }
}
