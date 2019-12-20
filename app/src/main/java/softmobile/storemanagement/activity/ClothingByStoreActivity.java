package softmobile.storemanagement.activity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

import softmobile.storemanagement.R;
import softmobile.storemanagement.activity.adapter.ClothingAdapter;
import softmobile.storemanagement.activity.adapter.ItemAdapter;
import softmobile.storemanagement.activity.mapper.ClothingMapper;

public class ClothingByStoreActivity extends FilterableActivity implements AdapterView.OnItemSelectedListener
{
    @Override
    public void setLayout()
    {
        setContentView(R.layout.activity_clothing_by_store);
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
        setAdapterFromResource(this, R.array.stores);
        list.setAdapter(new ClothingAdapter(this, new ClothingMapper().map(this.getResources().openRawResource(R.raw.clothing_store_a))));
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        ItemAdapter adapter = (ItemAdapter) list.getAdapter();
        switch (position)
        {
            case 0: adapter.swapItems(R.raw.clothing_store_a);
            break;
            case 1: adapter.swapItems(R.raw.clothing_store_b);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {}
}