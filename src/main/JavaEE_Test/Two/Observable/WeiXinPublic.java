package Two.Observable;

import java.util.ArrayList;
import java.util.List;

public class WeiXinPublic implements Subject {
    List<observer> weiXinUserList = new ArrayList<>();
    @Override
    public void add(observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void delete(observer observer) {
        weiXinUserList.remove(observer);
    }

    @Override
    public void notifyUser() {
        for (observer observer : weiXinUserList) {
            observer.update("花点时间内容更新了，快来看看");
        }
    }


}
