package softmobile.storemanagement.activity.mapper;

import softmobile.storemanagement.model.Parsable;
import softmobile.storemanagement.model.Sale;

public class SaleMapper extends Mapper
{
    @Override
    public Parsable parse(String[] fields)
    {
        return new Sale(fields[0], Double.parseDouble(fields[1]), fields[2],
                fields[3], fields[4]);
    }
}