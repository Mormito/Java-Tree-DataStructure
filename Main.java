public class Main {
    public static void main(String[] args) {
        Btree a = new Btree();

        //add values in the tree
        a.add(42);
        a.add(19);
        a.add(51);
        a.add(37);
        a.add(42);

        //show the numbers
        a.show();
    }
}