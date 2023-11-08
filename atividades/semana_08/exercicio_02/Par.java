public class Par (<E,T>){
    private E e;
    private T t;

    public Par(E e, T t){
        this.e = e;
        this.t = t;
    }

    public E getE(){
        return e;
    }

    public T getT(){
        return t;
    }

    public void toString(){
        System.out.println("Par: "e + "," + t);
    }
}