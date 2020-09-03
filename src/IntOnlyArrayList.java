
import java.util.ArrayList;

public class IntOnlyArrayList {
    //ArrayList erstattes med et int-array
    private ArrayList<Integer> ia;
    //tilføje field til at holde styr på størrelsen, eg. int str;

    public IntOnlyArrayList() {
        //int[] ia = new int[20];
        ia = new ArrayList<>();
        //str = 0;
    }

    public void add(int i){
        //skal erstattes med kode, der tilgår array
        ia.add(i);
    }

    public int get(int i){
        //skal erstattes med kode, der tilgår array
        return ia.get(i);
    }

    public void remove(int i){
        //skal erstattes med kode, der tilgår array
        ia.remove(i);
    }

    public int size(){
        //skal erstattes med kode, der bruger str
        return ia.size();
    }

    //her kan toString skrives
}