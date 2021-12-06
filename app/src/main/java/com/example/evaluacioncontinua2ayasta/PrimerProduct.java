package com.example.evaluacioncontinua2ayasta;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;

import com.example.evaluacioncontinua2ayasta.network.ProductGpc;
public class PrimerProduct extends Fragment{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }
    @Override
    public View onCreateView(

            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.interzas_primer, container, false);
        setUpToolbar(view);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 1, GridLayoutManager.VERTICAL, false));
        ProductMen adapter = new ProductMen(
                ProductGpc.initProductGpcList(getResources()));
        recyclerView.setAdapter(adapter);
        int largePadding = getResources().getDimensionPixelSize(R.dimen.pro_grid_sp);
        int smallPadding = getResources().getDimensionPixelSize(R.dimen.pro_grid_sp);
        recyclerView.addItemDecoration(new ProductItem(largePadding, smallPadding));
        return view;
    }
    private void setUpToolbar(View view){
        Toolbar toolbar = view.findViewById(R.id.app_bar);
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        if(activity != null){
            activity.setSupportActionBar(toolbar);
        }
    }
}
