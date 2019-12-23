package softmobile.storemanagement.activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import softmobile.storemanagement.R;
import softmobile.storemanagement.activity.mapper.ClothingMapper;
import softmobile.storemanagement.activity.mapper.Mapper;
import softmobile.storemanagement.model.Clothing;
import softmobile.storemanagement.model.Parsable;

public class ClothingAdapter extends ItemAdapter
{
    public ClothingAdapter(Context context, List<Parsable> items)
    {
        super(context, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        convertView = LayoutInflater.from(context).inflate(R.layout.clothing_list_item, null, false);
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

    @Override
    public List<Parsable> getItems(int resId)
    {
        return new ClothingMapper().map(context.getResources().openRawResource(resId));
    }
}