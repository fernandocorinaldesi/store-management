package softmobile.storemanagement.activity;

import softmobile.storemanagement.R;

public class ClothingByStoreActivity extends FilterableActivity
{
    @Override
    public void setLayout()
    {
        setContentView(R.layout.activity_clothing_by_store);
    }

    @Override
    public void setViews()
    {
        spinner = findViewById(R.id.store_spinner);
        list = findViewById(R.id.clothingList);
    }
}