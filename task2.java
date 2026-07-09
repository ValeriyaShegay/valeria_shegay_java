import java.util.Scanner;
public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        if (name.equals("John")) {
            System.out.println("Hello,John");
            
        }else{
            System.out.println("There is no such name");
        }
        scanner.close();
    }
}
