import java.util.ArrayList;
import java.util.Scanner;

public class SumIntegersAutoboxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers separated by space:");
        String input = sc.nextLine();
        String[] tokens = input.split(" ");  

        for (String token : tokens) {
            try {
                Integer num = Integer.parseInt(token);  
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println(token + " is not a valid integer.");
            }
        }

        int sum = 0;
        for (Integer num : numbers) {
            sum += num; 
        }

        System.out.println("Total Sum: " + sum);
        sc.close();
    }
}
