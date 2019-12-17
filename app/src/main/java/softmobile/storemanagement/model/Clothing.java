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

    public String getType()
    {
        return type;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getModel()
    {
        return model;
    }

    public String getSize()
    {
        return size;
    }

    public double getRetailPrice()
    {
        return retailPrice;
    }

    public double getWholesalePrice()
    {
        return wholesalePrice;
    }

    public int getStock()
    {
        return stock;
    }

    @Override
    public Map<String, String> parse()
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Tipo", type);
        map.put("Marca", brand);
        map.put("Modelo", model);
        map.put("Talle", size);
        map.put("Precio por Menor", retailPrice.toString());
        map.put("Precio por Mayor", wholesalePrice.toString());
        map.put("Stock", stock.toString());
        return map;
    }
}