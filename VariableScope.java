public class VariableScope {
    
    int instanceVariable = 10;

    static int staticVariable = 20;

    public void showLocalVariable() {
        int localVariable = 30;
        System.out.println("Local Variable: " + localVariable);
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
    }
    public void showInstanceVariable() {
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
    }

    public static void main(String[] args) {
        VariableScope newvar = new VariableScope();
        newvar.showLocalVariable();
        newvar.showInstanceVariable();

    }


}
