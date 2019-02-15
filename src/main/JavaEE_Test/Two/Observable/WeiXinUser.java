package Two.Observable;

public class WeiXinUser implements observer {
    private String userName ;
    public WeiXinUser(String name ) {
        this.userName = name;
    }

    @Override
    public void update(String s) {
        System.out.println(userName + ": " + s);
    }
}
