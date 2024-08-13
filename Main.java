public class Main {
    public static void main(String[] args) {
        Btree a = new Btree();

        //add values in the tree
        a.add(42);
        a.add(19);
        a.add(51);
        a.add(37);
        a.add(23);
        a.add(42);
        a.add(47);
        a.add(91);
        a.add(56);
        a.add(27);
        a.add(39);
        a.add(46);
        a.add(32);
        a.add(10);

        //show the numbers
        a.show();
    }
}