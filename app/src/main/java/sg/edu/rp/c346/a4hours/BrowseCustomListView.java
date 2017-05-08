package sg.edu.rp.c346.a4hours;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BrowseCustomListView extends AppCompatActivity {
    ListView lvJob;
    ArrayList<Job> jobList = new ArrayList<Job>();
    CustomAdapterJob caJob = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_custom_list_view);
        lvJob = (ListView) findViewById(R.id.ListViewJobs);
        caJob = new CustomAdapterJob(this, R.layout.job_list_row, jobList);
        lvJob.setAdapter(caJob);
    }
}
