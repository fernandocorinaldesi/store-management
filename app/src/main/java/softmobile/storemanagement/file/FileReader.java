package softmobile.storemanagement.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileReader
{
    public List<String> readFile(InputStream inputStream)
    {
        try
        {
            return read(inputStream);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    private List<String> read(InputStream inputStream) throws IOException
    {
        List<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = reader.readLine()) != null)
        {
            list.add(line);
        }
        return list;
    }
}