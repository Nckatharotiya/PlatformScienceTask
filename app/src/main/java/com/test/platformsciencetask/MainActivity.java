package com.test.platformsciencetask;

import static com.test.platformsciencetask.DriverJobAssignmentUtil.getDriverShipmentMatrix;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.test.platformsciencetask.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainModel mainModel = new MainModel();
        int[][] assignment = getDriverShipmentMatrix(mainModel);

        DriverListRecyclerView driverListRecyclerView = new DriverListRecyclerView(mainModel, assignment);
        activityMainBinding.rvMain.setAdapter(driverListRecyclerView);
    }
}