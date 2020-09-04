public class Main {

    public static void main(String[] args) {

        //instantier
        IntOnlyArrayList il = new IntOnlyArrayList();

        //Tilføj nogle tal
        il.add(1);
        il.add(27);
        il.add(33);

        System.out.println(il);

        il.remove(1);
        System.out.println("After we have removed an element");
        System.out.println(il);

        System.out.println("trying to get an element ot of bounds");
        System.out.println(il.get(5));

        System.out.println("See the size of our IntOnlyArrayList");
        System.out.println(il.size());
    }
}