import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueTuples {
    private String mainString;
    private int size;

    public UniqueTuples(String mainString, int size){
        setMainString(mainString);
        setSize(size);
    }

    public String getMainString() {
        return mainString;
    }

    public void setMainString(String mainString) {
        this.mainString = mainString;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Set uniqueTuples(){
        Set uniqueSet = new HashSet<>();
        //List<Object> tuple = new ArrayList<>();
        for (int i=0; i<this.mainString.length()-(this.size-1); i++){
            //how does substring actually works
            System.out.println(mainString.substring(i,this.size + i));
//                0 2
//                1 3
//                2 4
//                3 5
//                4 6
//                5 7
//                6 8
//                7 9

            uniqueSet.add(mainString.substring(i, this.size + i));
        }
        return uniqueSet;
    }
}
