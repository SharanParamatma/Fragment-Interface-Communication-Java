package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements DataCenter {
String a="Param";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PhysicsTeacher testMain=new PhysicsTeacher();
        System.out.println(testMain.collegeName);
        System.out.println(testMain.designation);
        System.out.println(testMain.mainSubject);
        testMain.does();
        System.out.println(a.hashCode());
        a= "Param";
        System.out.println(a.hashCode());

        getSupportFragmentManager().beginTransaction().add(R.id.line1,new FragmentOne())
                .add(R.id.line2,new FragmentTwo()).commit();
    }

    @Override
    public void SendData(String data) {
        FragmentTwo fragmentTwo= (FragmentTwo) getSupportFragmentManager().findFragmentById(R.id.line2);
        fragmentTwo.getData(data);
    }
}
