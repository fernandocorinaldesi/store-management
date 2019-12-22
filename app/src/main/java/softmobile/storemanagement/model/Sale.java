package softmobile.storemanagement.model;

import java.util.HashMap;
import java.util.Map;

public class Sale implements Parsable
{
    private String type;
    private Double amount;
    private String store;
    private String sellerName;
    private String date;

    public Sale(String type, Double amount, String store, String sellerName, String date)
    {
        this.type = type;
        this.amount = amount;
        this.store = store;
        this.sellerName = sellerName;
        this.date = date;
    }

    @Override
    public Map<String, String> parse()
    {
        Map<String, String> attributes = new HashMap<String, String>();
        attributes.put("Tipo", type);
        attributes.put("Monto", amount.toString());
        attributes.put("Local", store);
        attributes.put("Vendedor", sellerName);
        attributes.put("Fecha", date);
        return attributes;
    }
}