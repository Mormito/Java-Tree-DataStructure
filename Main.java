public class Main {
    public static void main(String[] args) {
        Btree a = new Btree();

        //add values in the tree
        a.add(100);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(99);
        a.add(10);
        a.add(10);
        a.add(22);
        a.add(23);

        //show the numbers
        a.show();

        //show size
        System.out.println("\nSize: " + a.size());
    }
}