package softmobile.storemanagement.activity.mapper;

import softmobile.storemanagement.model.Clothing;
import softmobile.storemanagement.model.Parsable;

public class ClothingMapper extends Mapper
{
    @Override
    public Parsable parse(String[] fields)
    {
        return new Clothing(fields[0], fields[1], fields[2], fields[3], Double.parseDouble(fields[4]),
                Double.parseDouble(fields[5]), Integer.parseInt(fields[6]));
    }
}