package ca.on.conestogac.cmms;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MaintenanceLogListActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance_log_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    @Override
    void onAPIResponse(String jsonString) {

    }


}