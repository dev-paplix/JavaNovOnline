public class BreakContinue {
    public static void main(String[] args) {

        //Break
        System.out.println("Using Just Break");
        
        for (int i = 0; i < 10; i++) {
            if (i ==3){
                break;
            }
            System.out.println("i " + i);
        }

        //Continue
        System.out.println("=====================================");
        System.out.println("\nUsing Just Continue");

        for (int j = 1; j < 10; j++) {
            if (j == 3){
                continue;
            }
            System.out.println("j " + j);
        }


    }
}
