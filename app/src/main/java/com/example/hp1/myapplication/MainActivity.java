package com.example.hp1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemLongClickListener ,AdapterView.OnItemClickListener{
    ListView lvCars;
    ArrayAdapter<String> adapter;
    ArrayList<String> arrCars=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrCars.add("A1");
        arrCars.add("TT");
        arrCars.add("A3");
        arrCars.add("A4");
        arrCars.add("A5");
        arrCars.add("A6");
        arrCars.add("A7");
        arrCars.add("A8");
        adapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_expandable_list_item_1, arrCars) ;
         lvCars=(ListView) findViewById(R.id.audi);
        lvCars.setOnItemLongClickListener(this);
        lvCars.setAdapter(adapter);
        lvCars.setOnItemClickListener(this);


    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {

            Toast.makeText(this,arrCars.get(i),Toast.LENGTH_SHORT).show();
        return true;

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        arrCars.remove(i);
        adapter.notifyDataSetChanged();

    }
}

