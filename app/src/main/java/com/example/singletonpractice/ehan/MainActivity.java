package com.example.singletonpractice.ehan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.singletonpractice.R;
import com.example.singletonpractice.ehan.CEO;
import com.example.singletonpractice.ehan.Company;
import com.example.singletonpractice.ehan.Staff;
import com.example.singletonpractice.ehan.VP;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //懒汉模式

        Company cp = new Company();
        //CEO对象只能通过getCeo函数获取
        Staff ceo1 = CEO.getmCeo();
        Staff ceo2 = CEO.getmCeo();
        cp.addStaff(ceo1);
        cp.addStaff(ceo2);
        //通过new创建VP对象
        Staff vp1 = new VP();
        Staff vp2 = new VP();
        //通过new创建Staff对象
        Staff staff1 = new Staff();
        Staff staff2 = new Staff();
        Staff staff3 = new Staff();

        cp.addStaff(vp1);
        cp.addStaff(vp2);
        cp.addStaff(staff1);
        cp.addStaff(staff2);
        cp.addStaff(staff3);

        cp.showAllStaffs();

    }
}
