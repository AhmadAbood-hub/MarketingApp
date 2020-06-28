package com.example.marketingapp.view.Fragments;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.marketingapp.R;
import com.example.marketingapp.model.Slide;
import com.example.marketingapp.adapter.SliderPagerAdapter;
import com.example.marketingapp.adapter.DepartmentTabAdapter;
import com.example.marketingapp.model.DepartmentTab;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class HomeFragment extends Fragment {



    private FragmentActivity myContext;

    public  RecyclerView recDepartmentTab;
    private RecyclerView.LayoutManager layoutManagerDepartmentTab;
    private DepartmentTabAdapter departmentTabAdapter;
    private List<DepartmentTab> departmentTabs;





    DepartmentFragment departmentFragment = new DepartmentFragment();

    public HomeFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home
                , container, false);

        recDepartmentTab = (RecyclerView) view.findViewById(R.id.recDepartmentTab);
        recDepartmentTab.setHasFixedSize(true);
        layoutManagerDepartmentTab = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        departmentTabAdapter = new DepartmentTabAdapter(getContext(), departmentTabs, HomeFragment.this);

        recDepartmentTab.setLayoutManager(layoutManagerDepartmentTab);
        departmentTabs = new ArrayList<>();

        departmentTabs.add(new DepartmentTab("News"));
        departmentTabs.add(new DepartmentTab("Foods"));
        departmentTabs.add(new DepartmentTab("Males"));
        departmentTabs.add(new DepartmentTab("Sports"));
        departmentTabs.add(new DepartmentTab("News"));
        departmentTabs.add(new DepartmentTab("Foods"));
        departmentTabs.add(new DepartmentTab("Males"));
        departmentTabs.add(new DepartmentTab("Sports"));
        departmentTabs.add(new DepartmentTab("News"));
        departmentTabs.add(new DepartmentTab("Foods"));
        departmentTabs.add(new DepartmentTab("Males"));
        departmentTabs.add(new DepartmentTab("Sports"));


        departmentTabAdapter.setData(departmentTabs);


        recDepartmentTab.setAdapter(departmentTabAdapter);




        changeFragment(departmentFragment);




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
