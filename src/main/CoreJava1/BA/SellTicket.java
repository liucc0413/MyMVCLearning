package BA;

import Two.Student;

public class SellTicket {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        new Thread(t).start();
        new Thread(t).start();
    }
}

class Ticket implements Runnable {

    private int ticket = 100;
    private Student student = new Student(20);

    public void run() {
        while (student.getScore() > 0) {
            ticket--;
            System.out.println(Thread.currentThread().getName()+" 当前票数为：" + ticket);
        }

    }
}
