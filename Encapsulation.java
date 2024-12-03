public class Encapsulation {
    private String name;
    private int age;

    // Getters

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    // Setters

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Encapsulation person = new Encapsulation();
        person.setName("Wong");
        person.setAge(25);

        System.out.println("The person name is: " + person.getName() + " and the age is: " + person.getAge());
    }
}
