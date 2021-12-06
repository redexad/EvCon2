package com.example.evaluacioncontinua2ayasta;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.toolbox.NetworkImageView;

public class ProductRep extends  RecyclerView.ViewHolder{
    public NetworkImageView productImage;
    public TextView productName;
    public TextView productPrice;

    public ProductRep(@NonNull View itemView){
        super(itemView);
        productImage = itemView.findViewById(R.id.product_image);
        productName = itemView.findViewById(R.id.product_name);
        productPrice = itemView.findViewById(R.id.product_price);
    }
 }
