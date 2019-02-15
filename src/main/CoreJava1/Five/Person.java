package Five;

import java.util.Comparator;

public class Person  {
    private  String type;
    public Person(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public Person() {}


    @Override
    public String toString() {
        return "Person{" +
                "type='" + type + '\'' +
                '}';
    }


}
