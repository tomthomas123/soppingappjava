import java.sql.*;
import java.util.Scanner;

public class Shoping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Enter the option below");
            System.out.println("1 :Insert");
            System.out.println("2 :View");
            System.out.println("3 :Search");
            System.out.println("4 :Update");
            System.out.println("5 :Delete");
            System.out.println("6 :Number of product manufactures in between month");
            System.out.println("7 :Name of the product staring letter");
            System.out.println("8 :exit");

            choice = sc.nextInt();
        }
    }
}
