import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] productNames = {
            "Cozy Nights Monarch", 
            "Restonic Barbados", 
            "Sealy Phuket"
        };
        
        int[][] sales = new int[3][3];
        
        // Input loop capturing sales data for 3 products across 3 months
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + productNames[i] + " mattress: ");
                sales[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println();
        
        // Instantiate Product and PrintProduct
        Product productApp = new Product(sales);
        PrintProduct printer = new PrintProduct();
        
        // Print final report
        printer.printReport(productApp);
        
        scanner.close();
    }
}