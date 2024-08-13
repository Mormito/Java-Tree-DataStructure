public class Bnode {
    //atributos
    private int x;
    private Bnode esq, dir;

    //construtor
    public Bnode(int valor) {
        x = valor;
        esq = null;
        dir = null;
    }

    //método add
    public void add(int valor){
        if(valor > x){
            if(dir != null) dir.add(valor);
            else dir = new Bnode(valor);
        }
        else{
            if(esq != null) esq.add(valor);
            else esq = new Bnode(valor);
        }
    }

    public void show(){
        System.out.println(x);
        if(esq!=null) esq.show();
        if (dir!=null) dir.show();
    }
}
