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
        if(raiz!=null) raiz.show();
        else System.out.println("Arvore Vazia");
    }

    public int size(){
        if(raiz!=null) return raiz.size();
        return 0;
    }

    public int soma(){
        if(raiz!=null) return raiz.soma();
        return 0;
    }
}
