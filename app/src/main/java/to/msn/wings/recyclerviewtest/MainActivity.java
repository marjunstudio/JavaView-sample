package to.msn.wings.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    public MainActivity() {
        super(R.layout.activity_main);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, MainFragment.class, null)
                    .commit();
        }
    }
}

//public class MainActivity extends AppCompatActivity implements MyAdapter.OnItemClickListener{
//    private RecyclerView recyclerView;
//    private MyAdapter adapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        // TODO:RecyclerViewの定義は別ファイルに切り出す！
//        recyclerView = findViewById(R.id.recyclerView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        List<ListItem> items = new ArrayList<>();
//        for (int i = 1; i <= 10; i++) {
//            items.add(new ListItem("Item " + i));
//        }
//
//        adapter = new MyAdapter(items, this);
//        recyclerView.setAdapter(adapter);
//    }
//
//    @Override
//    public void onItemClick(ListItem item) {
//        Intent intent = new Intent(this, DetailActivity.class);
//        intent.putExtra(DetailActivity.EXTRA_ITEM_TEXT, item.getText());
//        startActivity(intent);
//    }
//}