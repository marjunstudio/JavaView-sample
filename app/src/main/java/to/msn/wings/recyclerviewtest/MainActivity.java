package to.msn.wings.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<ListItem> items = new ArrayList<>();
        items.add(new ListItem("Item"));
        items.add(new ListItem("Item"));
        items.add(new ListItem("Item"));
        items.add(new ListItem("Item"));
        items.add(new ListItem("Item"));
        items.add(new ListItem("Item"));
        items.add(new ListItem("Item"));
        items.add(new ListItem("Item"));
        items.add(new ListItem("Item"));
        items.add(new ListItem("Item"));



        adapter = new MyAdapter(items);
        recyclerView.setAdapter(adapter);
    }
}