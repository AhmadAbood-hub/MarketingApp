package com.example.marketingapp.view.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.marketingapp.R;


public class DetailsProductFragment extends Fragment {

    TextView txtActDetProdOldPrice;

    View view;

    public DetailsProductFragment() {
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

        view = inflater.inflate(R.layout.fragment_details_product, container, false);


        txtActDetProdOldPrice = view.findViewById(R.id.txtActDetProdOldPrice);

        StrikeOldPrice();

        return  view;
    }






    private void StrikeOldPrice()
    {
        SpannableString ss = new SpannableString(txtActDetProdOldPrice.getText().toString());
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();

        String aa = txtActDetProdOldPrice.getText().toString();
        int s = aa.length();
        ss.setSpan(strikethroughSpan,0,s, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        txtActDetProdOldPrice.setText(ss);
    }

}
