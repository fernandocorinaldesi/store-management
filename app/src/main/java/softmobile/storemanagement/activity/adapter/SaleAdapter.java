package softmobile.storemanagement.activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import softmobile.storemanagement.R;
import softmobile.storemanagement.activity.mapper.SaleMapper;
import softmobile.storemanagement.model.Parsable;
import softmobile.storemanagement.model.Sale;

public class SaleAdapter extends ItemAdapter
{
    public SaleAdapter(Context context)
    {
        super(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        convertView = LayoutInflater.from(context).inflate(R.layout.sale_list_item, null, false);
        Parsable item = (Sale) getItem(position);
        TextView type = (TextView) convertView.findViewById(R.id.saleTypeText);
        TextView amount = (TextView) convertView.findViewById(R.id.amountText);
        TextView date = (TextView) convertView.findViewById(R.id.dateText);
        TextView store = (TextView) convertView.findViewById(R.id.storeText);
        TextView seller = (TextView) convertView.findViewById(R.id.sellerText);

        type.setText(item.parse().get("Tipo"));
        amount.setText("$" + item.parse().get("Monto"));
        date.setText(item.parse().get("Fecha"));
        store.setText(item.parse().get("Local"));
        seller.setText("" + item.parse().get("Vendedor"));
        return convertView;
    }

    @Override
    public List<Parsable> getItems(int resId)
    {
        return new SaleMapper().map(context.getResources().openRawResource(resId));
    }
}