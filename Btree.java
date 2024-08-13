public class Btree {
    Bnode raiz;

    //Construtor
    public Btree() {
        raiz = null;
    }

    public void add(int valor){
        //sempre no if colocar algo mais frequente como primeira condição, é mais efetivo;
        if(raiz != null){
            raiz.add(valor);
        }
        else{
            raiz = new Bnode(valor);
        }

    }

    public void show(){

    }
}
