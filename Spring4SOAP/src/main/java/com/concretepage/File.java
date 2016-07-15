import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class File
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader in=new BufferedReader(new FileReader("D:\\IdeaProjects\\Spring4SOAP\\src\\main\\resources\\Test.txt"));
        int i=0;
        String s=null;
        Map<String,String> hm=new TreeMap<String,String>();

        while((s=in.readLine())!=null)
        {
            String[] a=s.split(":");
            hm.put(a[i],s);
//            i++;
        }
        in.close();
        FileWriter w=new FileWriter("Test1.txt");
        for(String val : hm.values())
        {
            w.write(val);
        }
        w.close();
    }


}

