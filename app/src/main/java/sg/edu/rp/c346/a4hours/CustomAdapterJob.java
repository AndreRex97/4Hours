package sg.edu.rp.c346.a4hours;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15017103 on 9/5/2017.
 */

public class CustomAdapterJob extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Job> jobArrayList;

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvJobTitle = (TextView) rowView.findViewById(R.id.textViewDateTime);
        TextView tvSalary = (TextView) rowView.findViewById(R.id.textViewSalary);
        TextView tvDateTime = (TextView) rowView.findViewById(R.id.textViewDateTime);
        TextView tvLanguage = (TextView) rowView.findViewById(R.id.textViewLanguage);
        Job currentItem = jobArrayList.get(position);
        tvJobTitle.setText(currentItem.getJobTitle());
        tvSalary.setText("$" + currentItem.getSalary() + "/hr");
        tvDateTime.setText(currentItem.getDateTime());
        tvLanguage.setText(currentItem.getLanguage().toUpperCase());
        return rowView;
    }

    public CustomAdapterJob(Context context, int resource, ArrayList<Job> objects){
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        jobArrayList = objects;
    }
}