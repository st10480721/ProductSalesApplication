import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        // Arrange: mock 2D array with known values
        // Product 1: 25+18+20 = 63
        // Product 2: 15+10+12 = 37
        // Product 3: 18+15+20 = 53
        // Total expected = 153
        int[][] sampleData = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };
        Product product = new Product(sampleData);

        // Act
        int actualTotal = product.GetTotalProductsSold();

        // Assert
        assertEquals(153, actualTotal, "Total product sales calculation is incorrect.");
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        // Arrange: 153 total across 9 data points = 17.0 average
        int[][] sampleData = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };
        Product product = new Product(sampleData);

        // Act
        double actualAverage = product.GetAverageProductSold();

        // Assert
        assertEquals(17.0, actualAverage, 0.001, "Average product sales calculation is incorrect.");
    }
}