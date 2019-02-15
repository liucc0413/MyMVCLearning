package Two.Observable;

public class ObserverMain {
    public static void main(String[] args) {
        WeiXinUser user1 = new WeiXinUser("lcc");
        WeiXinUser user2 = new WeiXinUser("chenguang");
        WeiXinUser user3 = new WeiXinUser("test");
        WeiXinPublic hua = new WeiXinPublic();
        hua.add(user1);
        hua.add(user2);
        hua.add(user3);
        hua.notifyUser();

    }
}
