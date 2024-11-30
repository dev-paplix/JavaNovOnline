public class AssignmentFour {
    public static void main(String[] args) {

        String[][] cars = {
            {"2015", "Toyota Vios"},
            {"2019", "Honda Accord"},
            {"2021", "BMW 3 Series"}
        };

        double[] prices = {30000, 40000, 90000};

        System.out.println("Cars with prices above 50,000 RM:");
        for (int i = 0; i < cars.length; i++) {
            if (prices[i] > 50000) {
                System.out.println(cars[i][1] + " " + cars[i][0] +" - " + prices[i] + " RM");
            }
        }

        
    }
}