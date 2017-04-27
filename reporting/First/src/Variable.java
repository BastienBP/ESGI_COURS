/**
 * Created by bbr on 25/04/2017.
 */
public class Variable implements Comparable<Value>{

    @Override
    public int compareTo(Value o) {
        return 0;
    }
    public abstract Variable parse(String rawValue);
}
