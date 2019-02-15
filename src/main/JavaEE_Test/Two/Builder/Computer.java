package Two.Builder;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<String> parts = new ArrayList<>();
    private String cpu;
    private String mainBoard;
    private String HD;
    public  Computer () {

    }

    public  Computer(String cpu, String mainBoard, String HD) {
        this.cpu = cpu;
        this.mainBoard = mainBoard;
        this.HD = HD;
    }

    public void addPart (String part) {
        parts.add(part);
    }

    public void show () {
        for (String name : parts) {
            System.out.println("已经组装："+name);
        }
    }

    public void show2 () {
        System.out.println(cpu +" "+mainBoard +" "+HD);
    }

    public  class ComputerBuilder  {

        private String cpu;
        private String mainBoard;
        private String HD;

        public ComputerBuilder () {}
        public ComputerBuilder setCPU (String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setMainBoard (String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        public ComputerBuilder setHD (String HD) {
            this.HD = HD;
            return this;
        }

        public Computer builder () {
            return new Computer(this.cpu, this.mainBoard, this.HD);
        }
    }


}
