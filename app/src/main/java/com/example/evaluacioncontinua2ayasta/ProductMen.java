package com.example.evaluacioncontinua2ayasta;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.evaluacioncontinua2ayasta.network.ImageRequest;
import com.example.evaluacioncontinua2ayasta.network.ProductGpc;
import java.util.List;

public class ProductMen extends RecyclerView.Adapter<ProductRep> {
    private List<ProductGpc> productList;
    private ImageRequest imageRequester;
    ProductMen(List<ProductGpc> productList){
        this.productList = productList;
        imageRequester = ImageRequest.getInstance();
    }
    @NonNull
    @Override
    public ProductRep onCreateViewHolder(@NonNull ViewGroup parent, int viewType ){
        View LayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_men, parent, false);
        return new ProductRep(LayoutView);
    }
    @Override
    public void onBindViewHolder(@NonNull ProductRep holder, int position){
        if(productList != null && position < productList.size()){
            ProductGpc product = productList.get(position);
            holder.productTitle.setText(product.name);
            holder.productPrice.setText(product.price);
            imageRequester.setImageFromUrl(holder.productImage, product.url);
        }
    }
    @Override
    public int getItemCount(){return productList.size();}
}

