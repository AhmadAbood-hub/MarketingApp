package com.example.marketingapp.view.Fragments;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.marketingapp.R;
import com.example.marketingapp.adapter.ProductAdapter;
import com.example.marketingapp.adapter.ProductAdapter;
import com.example.marketingapp.model.Product;
import com.example.marketingapp.model.Product;

import java.util.ArrayList;
import java.util.List;


public class ProductFragment extends Fragment {

    private RecyclerView recFrgProductAllProduct;
    private RecyclerView.LayoutManager layoutManager;
    private ProductAdapter productAdapter;
    private List<Product> products;
    private FragmentActivity myContext;


    public ProductFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_product, container, false);


        recFrgProductAllProduct = (RecyclerView) view.findViewById(R.id.recFrgProductAllProduct);
        recFrgProductAllProduct.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        recFrgProductAllProduct.setLayoutManager(layoutManager);
        products = new ArrayList<>();
        productAdapter = new ProductAdapter(getContext(), products, ProductFragment.this);




        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));
        products.add(new Product("Product"));

        recFrgProductAllProduct.setAdapter(productAdapter);


        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        myContext = (FragmentActivity) activity;
        super.onAttach(activity);
    }


    public void changeFragment(Fragment fragment) {
        FragmentManager fragManager = myContext.getSupportFragmentManager();

        fragManager.beginTransaction().replace(R.id.frmDepartmentProduct, fragment).commit();
    }


}
