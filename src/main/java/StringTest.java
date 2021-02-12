import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        System.out.println("Please enter your input here: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (StringUtils.isNumeric(input)){
            System.out.println(input + " is a number");
        } else {
            System.out.println("is not a number");
            System.out.println("Flipped: " + StringUtils.swapCase(input));
            System.out.println("Reversed: " + StringUtils.reverse(input));
        }
    }
}