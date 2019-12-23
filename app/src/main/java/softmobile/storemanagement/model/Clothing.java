package softmobile.storemanagement.model;

import java.util.HashMap;
import java.util.Map;

public class Clothing implements Parsable
{
    private String type;
    private String brand;
    private String model;
    private String size;
    private Double retailPrice;
    private Double wholesalePrice;
    private Integer stock;

    public Clothing(String type, String brand, String model, String size, Double retailPrice, Double wholesalePrice,
                    Integer stock)
    {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.retailPrice = retailPrice;
        this.wholesalePrice = wholesalePrice;
        this.stock = stock;
    }

    @Override
    public Map<String, String> parse()
    {
        Map<String, String> attributes = new HashMap<String, String>();
        attributes.put("Tipo", type);
        attributes.put("Marca", brand);
        attributes.put("Modelo", model);
        attributes.put("Talle", size);
        attributes.put("Precio por Menor", retailPrice.toString());
        attributes.put("Precio por Mayor", wholesalePrice.toString());
        attributes.put("Stock", stock.toString());
        return attributes;
    }
}