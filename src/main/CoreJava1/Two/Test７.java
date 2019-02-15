package Two;



import org.joda.time.LocalDate;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

import java.util.Date;

@RunWith(JUnit4ClassRunner.class)
public class Test７ {
    private final Date test;
    public Test７() {
        test = new Date();
    }

    public static void main(String[] args) {
        Test７ fd = new Test７();

        LocalDate l = new LocalDate();
        l = l.plusMonths(1);
        LocalDate localDate = new LocalDate(l);
        int month = localDate.getMonthOfYear();
        int today = localDate.getDayOfMonth();
        localDate = localDate.minusDays(today-1);
        int weekDate = localDate.getDayOfWeek();
        System.out.println("Mon Tue Wen Thu Fri Sat Sun");
        for (int i = 1; i<weekDate; i++) {
            System.out.print("    ");
        }
        while (localDate.getMonthOfYear() == month) {
            System.out.printf("%3d",localDate.getDayOfMonth());
            if (localDate.equals(today)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            if (localDate.getDayOfWeek() == 7) {
                System.out.println();
            }
            localDate = localDate.plusDays(1);
        }
        if(localDate.getDayOfWeek() != 1) {
            System.out.println();
        }
    }
}
