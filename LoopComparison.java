public class LoopComparison {
    public static void main(String[] args) {
        
        // for loop
        System.out.println("for loop:");
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println("For Loop Counter " + counter);
        }

        // while loop
        System.out.println("while loop:");
        int counter = 1;
        while (counter <= 5) {
            System.out.println("While Loop Counter " + counter);
            counter++;
        }

        // do-while loop

        System.out.println("do-while loop:");
        counter = 1;
        do {
            System.out.println("Do While Loop Counter " + counter);
            counter++;
        } while (counter <= 5);
    }
}
