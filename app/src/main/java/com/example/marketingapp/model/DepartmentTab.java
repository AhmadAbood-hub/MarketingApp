package com.example.marketingapp.model;

import com.example.marketingapp.R;

public class DepartmentTab {
    String name;
    Boolean click;


    public DepartmentTab(String name) {
        this.name = name;
        click = false;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getClick() {
        return click;
    }

    public void setClick(Boolean click) {
        this.click = click;
    }


}
