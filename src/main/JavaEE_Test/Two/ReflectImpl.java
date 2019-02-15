package Two;

public class ReflectImpl {
    private String name;
    public ReflectImpl(String name) {
        this.name = name;
    }
    public ReflectImpl () {}
    public void  sallHello(String name) {
        System.out.println("hello " + name);
    }
    public void  sallHello() {
        System.out.println("hello " + name);
    }
}
