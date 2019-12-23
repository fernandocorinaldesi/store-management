package softmobile.storemanagement.activity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

import softmobile.storemanagement.model.Parsable;

public abstract class ItemAdapter extends BaseAdapter
{
    protected Context context;
    protected List<Parsable> items;

    public ItemAdapter(Context context)
    {
        this.context = context;
        this.items = new ArrayList<Parsable>();
    }

    @Override
    public int getCount()
    {
        return items.size();
    }

    @Override
    public Object getItem(int position)
    {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    public void swapItems(int resId)
    {
        items.clear();
        loadItems(resId);
        notifyDataSetChanged();
    }

    public abstract List<Parsable> getItems(int resId);

    public void loadItems(int resId)
    {
        for (Parsable item : getItems(resId))
        {
            items.add(item);
        }
    }
}