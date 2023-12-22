package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UseProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* instantiate a list of products with a ArrayList.*/
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        //looping for collect data products.
        for (int i = 0; i < n ; i++) {
            System.out.println("Product #" + (i + 1) + "data: " );
            System.out.print("Common, used or imported ( c /u/ i ) ?");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();
            if (ch == 'c' ) {
                Product product = new Product(name, price);
                products.add(product);
            }
            else if (ch == 'i') {
                System.out.println("Customs fee: ");
                double customsFee = sc.nextDouble();
                ImportedProduct importedProduct = new ImportedProduct(name, price, customsFee);
                products.add(importedProduct);
            }
            else {
                if (ch == 'u') {
                    System.out.println("Manufacture date (DD/MM/YYYY): ");
                    LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    UseProduct useProduct = new UseProduct(name, price,date);
                    products.add(useProduct);
                }
            }
        }

        /* show in the screen the information of price tags.*/
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }
        sc.close();
    }
}
