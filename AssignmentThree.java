public class AssignmentThree {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 14) {
                continue;
            }
            if (i == 26) {
                break;
            }
            System.out.println(i);
        }
    }
    
}
