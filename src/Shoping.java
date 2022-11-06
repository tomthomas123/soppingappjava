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
            switch (choice) {
                case 1:
                    System.out.println("Insert");
                    System.out.println("Enter the name ");
                    String name = sc.next();
                    System.out.println("Enter the description ");
                    String desname = sc.next();
                    System.out.println("Enter the manufacture date");
                    String date = sc.next();
                    System.out.println("Enter the brand name");
                    String brandName = sc.next();
                    System.out.println("Enter the price");
                    int price = sc.nextInt();
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingdb", "root", "");
                        String sql = "INSERT INTO `products`( `product_name`, `description`, `manf_date`, `brand_name`, `price`) VALUES (?,?,?,?,?)";
                        PreparedStatement stmt = con.prepareStatement(sql);
                        stmt.setString(1, name);
                        stmt.setString(2, desname);
                        stmt.setString(3, date);
                        stmt.setString(4, brandName);
                        stmt.setInt(5, price);
                        stmt.executeUpdate();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
            }
        }
    }
}
