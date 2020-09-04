import java.util.Arrays;

public class IntOnlyArrayList {
    private int[] ia;

    public IntOnlyArrayList() {
        ia = new int[0];
    }

    public void add(int i){
        int n = ia.length;
        int[] copy = Arrays.copyOf(ia, n+1);
        copy[n] = i;
        ia = copy;
    }

    public int get(int i) {
        try {
            return ia[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown" + e);
        }
        return -1;
    }

    public void remove(int i){
        int n = ia.length; 
        int[] copy = Arrays.copyOf(ia, n-1);

        for (int j = 0, k = 0;  j < ia.length; j++) {

            //if i is the removal element
            if (j == i) {
                continue;
            }
            //if the i is not the removal element
            copy[k++] = ia[j];

        }
        ia = copy;
    }

    public int size(){
       return ia.length;
    }

    @Override
    public String toString() {
        return "IntOnlyArrayList{" +
                "ia=" + Arrays.toString(ia) +
                '}';
    }
}