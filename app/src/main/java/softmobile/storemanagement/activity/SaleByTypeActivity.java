package softmobile.storemanagement.activity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

import softmobile.storemanagement.R;
import softmobile.storemanagement.activity.adapter.ItemAdapter;
import softmobile.storemanagement.activity.adapter.SaleAdapter;
import softmobile.storemanagement.activity.mapper.SaleMapper;

public class SaleByTypeActivity extends FilterableActivity implements AdapterView.OnItemSelectedListener
{
    @Override
    public void setLayout() {
        setContentView(R.layout.activity_sale_by_type);
    }

    @Override
    public void setViews()
    {
        spinner = (Spinner) findViewById(R.id.saleTypespinner);
        list = (ListView) findViewById(R.id.salesList);
    }

    @Override
    public void setViewsAdapters()
    {
        setAdapterFromResource(this, R.array.saleTypes);
        list.setAdapter(new SaleAdapter(this, new SaleMapper().map(this.getResources().openRawResource(R.raw.retail_sales))));
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        ItemAdapter adapter = (ItemAdapter) list.getAdapter();
        switch (position)
        {
            case 0: adapter.swapItems(R.raw.retail_sales);
            break;
            case 1: adapter.swapItems(R.raw.wholesale_sales);
            break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {}
}