class container<T>{
    private T value;

    public container(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}

public class generics {
    public static void main(String[] args){
        container<String> c = new container<>("abc");
        System.out.println(c.getValue());
        c.setValue("def");
        System.out.println(c.getValue());
        container<Integer> c2 = new container<Integer>(12);
        System.out.println(c2.getValue());
    }
}