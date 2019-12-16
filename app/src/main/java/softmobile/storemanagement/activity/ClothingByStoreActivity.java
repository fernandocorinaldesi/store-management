package softmobile.storemanagement.activity;

import android.widget.ListView;
import android.widget.Spinner;

import softmobile.storemanagement.R;
import softmobile.storemanagement.activity.adapter.ClothingAdapter;

public class ClothingByStoreActivity extends FilterableActivity
{
    @Override
    public void setLayout()
    {
        setContentView(R.layout.activity_clothing_by_store);
        //setAdapterFromResource(..)
        //list.setAdapter(..)
    }

    @Override
    public void setViews()
    {
        spinner = (Spinner) findViewById(R.id.store_spinner);
        list = (ListView) findViewById(R.id.clothingList);
    }

    @Override
    public void setViewsAdapters()
    {
        setAdapterFromResource(this, R.raw.clothing_store_a);
        list.setAdapter(new ClothingAdapter());
    }
}