package softmobile.storemanagement.activity.mapper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import softmobile.storemanagement.file.FileReader;
import softmobile.storemanagement.model.Parsable;

public abstract class Mapper
{
    public List<Parsable> map(InputStream inputStream)
    {
        List<String> list = FileReader.readFile(inputStream);
        List<Parsable> parsables = new ArrayList<Parsable>();
        for (String item: list)
        {
            parsables.add(parse(item.split(",")));
        }
        return parsables;
    }

    public abstract Parsable parse(String[] fields);
}