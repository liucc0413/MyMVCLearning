package Two.Builder;

public class ConCreateBuilder implements Builder {

    private Computer computer = new Computer();
    @Override
    public void builderCpu() {
        computer.addPart("cpu");
    }

    @Override
    public void builderMainBoard() {
        computer.addPart("mainBoard");
    }

    @Override
    public void builderHD() {
        computer.addPart("HD");
    }

    public Computer getComputer() {
        return computer;
    }


}
