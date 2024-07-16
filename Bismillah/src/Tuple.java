import java.util.ArrayList;

public class Tuple<T> {
    private ArrayList<T> stringList;

    public Tuple(ArrayList<T> stringList) {
        this.stringList = stringList;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((stringList == null) ? 0 : stringList.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tuple other = (Tuple) obj;
        if (stringList == null) {
            if (other.stringList != null)
                return false;
        } else if (!stringList.equals(other.stringList))
            return false;
        return true;
    }

    @Override
    public String toString() {
        String stringFinal = "(";
        for (T item: this.stringList) {
            stringFinal = stringFinal + "'" + item + "', ";
        }
        stringFinal = stringFinal + ")";
        return stringFinal;
    }
    
    public ArrayList<T> toArray() {
        return this.stringList;
    }
}
