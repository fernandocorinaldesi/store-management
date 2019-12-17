package softmobile.storemanagement.activity;

import android.view.LayoutInflater;
import android.widget.ListView;
import android.widget.Spinner;

import softmobile.storemanagement.R;
import softmobile.storemanagement.activity.adapter.ClothingAdapter;
import softmobile.storemanagement.activity.mapper.ClothingMapper;
import softmobile.storemanagement.file.FileReader;

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
        setAdapterFromResource(this, R.array.stores);
        list.setAdapter(new ClothingAdapter((LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE), new ClothingMapper().map(FileReader.readFile(this.getResources().openRawResource(R.raw.clothing_store_a)))));
    }
}