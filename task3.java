import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        for (int i=0; i < n; i++ ){
                array [i] = scanner.nextInt();
            }
        
        for (int i = 0; i < n; i++){
            if(array[i] % 3 == 0){
                System.out.println(array[i] + " ");
            }
        } 
    scanner.close();
    }
}
