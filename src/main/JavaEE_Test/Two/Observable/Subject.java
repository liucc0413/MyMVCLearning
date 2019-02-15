package Two.Observable;
import Two.Observable.*;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    public void add (observer observer);
    public void  delete (observer observer);
    public void notifyUser();
}
