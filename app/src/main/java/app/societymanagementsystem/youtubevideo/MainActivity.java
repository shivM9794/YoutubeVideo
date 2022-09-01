package app.societymanagementsystem.youtubevideo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import app.societymanagementsystem.DataSetList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerview;
    ArrayList<DataSetList> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        arrayList = new ArrayList<DataSetList>();
        DataSetList dataSetList = new DataSetList("https://www.youtube.com/watch?v=sZYuOjZIWpA");
        arrayList.add(dataSetList);

        DataSetList dataSetList1 = new DataSetList("https://www.youtube.com/watch?v=sZYuOjZIWpA");
        arrayList.add(dataSetList1);

        DataSetList dataSetList2 = new DataSetList("https://www.youtube.com/watch?v=sZYuOjZIWpA");
        arrayList.add(dataSetList2);

        DataSetList dataSetList3 = new DataSetList("https://www.youtube.com/watch?v=sZYuOjZIWpA");
        arrayList.add(dataSetList3);

        DataSetList dataSetList4 = new DataSetList("https://www.youtube.com/watch?v=sZYuOjZIWpA");
        arrayList.add(dataSetList4);
        YoutubeAdapter youtubeAdapter = new YoutubeAdapter(arrayList,getApplicationContext());
        recyclerview.setAdapter(youtubeAdapter);

    }
}