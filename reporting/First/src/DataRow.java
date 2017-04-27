import java.util.ArrayList;
import javax.xml.crypto.Data;
import java.util.List;


/**
 * Created by bbr on 25/04/2017.
 */
public class DataRow {
    public DataRow(){
        this.list = new ArrayList<>();
    }
    public DataRow(List<Variable> list){
        this.list = list;
    }
    private List<Variable> list;
}
