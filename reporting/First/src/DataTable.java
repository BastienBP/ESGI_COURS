import javax.xml.crypto.Data;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bbr on 25/04/2017.
 */
public class DataTable {
    public  DataTable(){
        this.list = new ArrayList<>();
    }
    public DataTable(List<DataRow> list){
        this.list = list;
    }
    public DataTable parsing(){

    }
    public static DataTable fromCSV(String path, ParsingOptions parsingOptions){
        String rawData;
        try{
            rawData = new String(Files.readAllBytes(Paths.get(path)), Charset.forName("UTF-8"));
            return dataTable.parse(rawData, parsingOptions);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    private List<DataRow> list;
}
