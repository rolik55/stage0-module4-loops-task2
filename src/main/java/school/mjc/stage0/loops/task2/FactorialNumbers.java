package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number = 0, factorial = 1;
        while (number <= printToInclusive) {
            if(number == 0) {
                System.out.println(factorial);
            }
            else {
                factorial*= number;
                System.out.println(factorial);
            }
            number++;
        }
    }
}
