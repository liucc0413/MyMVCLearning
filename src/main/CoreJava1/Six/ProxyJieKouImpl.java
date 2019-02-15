package Six;

public class ProxyJieKouImpl implements proxyJiekou {
    @Override
    public String test() {
        System.out.println("jiekou");
        return "hello world";
    }
}
