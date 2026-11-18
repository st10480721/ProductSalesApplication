public class Product implements IProduct {
    // 1D array for product names
    private final String[] productNames = {
        "Cozy Nights Monarch", 
        "Restonic Barbados", 
        "Sealy Phuket"
    };
    
    // 2D array: 3 products (rows) x 3 months (columns)
    private final int[][] salesData;

    // Constructor accepting the 2D sales array
    public Product(int[][] salesData) {
        this.salesData = salesData;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                total += salesData[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int count = 0;
        for (int i = 0; i < salesData.length; i++) {
            count += salesData[i].length;
        }
        return (count == 0) ? 0.0 : (double) total / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int maxSales = -1;
        int bestIndex = 0;
        
        for (int i = 0; i < salesData.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                productTotal += salesData[i][j];
            }
            if (productTotal > maxSales) {
                maxSales = productTotal;
                bestIndex = i;
            }
        }
        return productNames[bestIndex] + " (" + maxSales + ")";
    }
}