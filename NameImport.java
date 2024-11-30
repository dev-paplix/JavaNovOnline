import java.util.Scanner;

public class NameImport {

    public static void main(String[] args) {
        Scanner myimput = new Scanner(System.in); 
        System.out.println("Enter your name: ");
        String enteredName = myimput.nextLine();
        System.out.println("Hello " + enteredName + "!");
    }
    
}
