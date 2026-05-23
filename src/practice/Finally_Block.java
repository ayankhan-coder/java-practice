package practice;/*finally is used to close resources but in modern java we use
try-with-resource*/

public class Finally_Block {
    public static int greet(){
        try {
            int a = 10;
            int b = 20;
            int c = a / b;
            return c;
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up Resources : end of the program");
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(greet());

    }
}
