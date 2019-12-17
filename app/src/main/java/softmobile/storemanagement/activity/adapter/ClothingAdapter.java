package softmobile.storemanagement.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import softmobile.storemanagement.R;
import softmobile.storemanagement.model.Clothing;
import softmobile.storemanagement.model.Parsable;

public class ClothingAdapter extends EntityAdapter
{
    public ClothingAdapter(LayoutInflater inflater, List<Parsable> parsables) {
        super(inflater, parsables);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        convertView = inflater.inflate(R.layout.list_item, null, false);
        Parsable item = (Clothing) getItem(position);
        TextView type = (TextView) convertView.findViewById(R.id.typeText);
        TextView brand = (TextView) convertView.findViewById(R.id.brandText);
        TextView model = (TextView) convertView.findViewById(R.id.modelText);
        TextView prices = (TextView) convertView.findViewById(R.id.priceText);
        TextView retailPrice = (TextView) convertView.findViewById(R.id.retailPriceText);
        TextView wholesalePrice = (TextView) convertView.findViewById(R.id.wholesalePriceText);
        TextView stock = (TextView) convertView.findViewById(R.id.stockText);

        type.setText(item.parse().get("Tipo"));
        brand.setText(item.parse().get("Marca"));
        model.setText("Modelo: " + item.parse().get("Modelo"));
        prices.setText("Precios");
        retailPrice.setText("Por Menor: $" + item.parse().get("Precio por Menor"));
        wholesalePrice.setText("Por Mayor: $" + item.parse().get("Precio por Mayor"));
        stock.setText("Stock: " + item.parse().get("Stock"));
        return convertView;
    }
}