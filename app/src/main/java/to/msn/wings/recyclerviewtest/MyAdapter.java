package to.msn.wings.recyclerviewtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Viewholder> {
    private List<ListItem> itemList;

    public MyAdapter(List<ListItem> itemList) {
        this.itemList = itemList;
    }

    // 何これ？
    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(Viewholder holder, int position) {
        ListItem item = itemList.get(position);
        holder.textView.setText(item.getText());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class Viewholder extends RecyclerView.ViewHolder {
        TextView textView;

        public Viewholder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.itemTextView);
        }
    }

}
