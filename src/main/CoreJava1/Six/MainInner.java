package Six;

public class MainInner {
    public static void main(String[] args) {
        NeiBuLeiTest neiBuLeiTest = new NeiBuLeiTest(18, "lcc");
        NeiBuLeiTest.innerClass innerClass = neiBuLeiTest.new innerClass();
        innerClass.run();
        System.out.println(neiBuLeiTest.getAge());
    }
}
