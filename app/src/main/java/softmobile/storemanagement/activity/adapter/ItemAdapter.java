package softmobile.storemanagement.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import softmobile.storemanagement.model.Parsable;

public abstract class ItemAdapter extends BaseAdapter
{
    protected LayoutInflater inflater;
    protected List<Parsable> items;

    public ItemAdapter(LayoutInflater inflater, List<Parsable> items)
    {
        this.inflater = inflater;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
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
}