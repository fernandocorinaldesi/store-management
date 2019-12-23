package softmobile.storemanagement.activity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import softmobile.storemanagement.R;
import softmobile.storemanagement.activity.adapter.ItemAdapter;
import softmobile.storemanagement.activity.adapter.SaleAdapter;

public class SaleByTypeActivity extends FilterableActivity implements AdapterView.OnItemSelectedListener
{
    private TextView totalText;

    @Override
    public void setLayout()
    {
        setContentView(R.layout.activity_sale_by_type);
    }

    @Override
    public void setViews()
    {
        spinner = (Spinner) findViewById(R.id.saleTypespinner);
        list = (ListView) findViewById(R.id.salesList);
        totalText = (TextView) findViewById(R.id.totalText);
    }

    @Override
    public void setViewsAdapters()
    {
        setAdapterFromResource(this, R.array.saleTypes);
        list.setAdapter(new SaleAdapter(this));
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        ItemAdapter adapter = getListAdapter();
        switch (position)
        {
            case 0: adapter.swapItems(R.raw.total_sales);
            break;
            case 1: adapter.swapItems(R.raw.retail_sales);
            break;
            case 2: adapter.swapItems(R.raw.wholesale_sales);
            break;
        }
        totalText.setText("Total: $" + getTotalByPosition(position));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {
        totalText.setText("Total: $4870");
        ItemAdapter adapter = getListAdapter();
        adapter.loadItems(R.raw.total_sales);

    }

    private String getTotalByPosition(int position)
    {
        String total = "";
        switch (position)
        {
            case 0: total = "4870";
            break;
            case 1: total = "1220";
            break;
            case 2: total = "3650";
            break;
        }
        return total;
    }
}