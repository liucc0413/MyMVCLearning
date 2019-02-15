package Two.Builder;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Builder builder = new ConCreateBuilder();
        Direct direct  = new Direct();
        direct.Constructer(builder);
        Computer computer = builder.getComputer();
        computer.show();

        Computer computer2 = new Computer().new ComputerBuilder().setCPU("cpu2").setMainBoard("主板").setHD("HD2").builder();
        computer2.show2();


    }
}
