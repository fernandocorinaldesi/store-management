package softmobile.storemanagement.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import softmobile.storemanagement.model.Parsable;

public abstract class EntityAdapter extends BaseAdapter
{
    protected LayoutInflater inflater;
    protected List<Parsable> parsables;

    public EntityAdapter(LayoutInflater inflater, List<Parsable> parsables)
    {
        this.inflater = inflater;
        this.parsables = parsables;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return parsables.get(position);
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