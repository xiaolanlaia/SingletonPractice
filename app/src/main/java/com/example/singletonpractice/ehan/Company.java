package com.example.singletonpractice.ehan;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by W on 2018/12/14.
 */

public class Company {

    private  String TAG = "Company";
    private List<Staff>allStaffs = new ArrayList<Staff>();
    public void addStaff(Staff per){
        allStaffs.add(per);
    }

    public void showAllStaffs(){
        for (Staff per : allStaffs){
            Log.d(TAG, "showAllStaffs: " + per.toString());
        }
    }
}
