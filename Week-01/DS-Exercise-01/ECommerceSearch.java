import java.util.Arrays;
import java.util.Comparator;

public class ECommerceSearch {

    // Product class containing searchable product details
    static class Product {
        int productId;
        String productName;
        String category;

        Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }

        @Override
        public String toString() {
            return "Product ID: " + productId
                    + ", Name: " + productName
                    + ", Category: " + category;
        }
    }

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {

        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        // Unsorted array used for linear search
        Product[] products = {
                new Product(104, "Headphones", "Electronics"),
                new Product(101, "Laptop", "Electronics"),
                new Product(105, "Shoes", "Fashion"),
                new Product(102, "Mobile Phone", "Electronics"),
                new Product(103, "Coffee Maker", "Home Appliances")
        };

        int targetId = 102;

        // Linear search
        Product linearResult = linearSearch(products, targetId);

        if (linearResult != null) {
            System.out.println("Linear Search Result:");
            System.out.println(linearResult);
        } else {
            System.out.println("Product not found using linear search.");
        }

        // Create a copy before sorting so the original array remains unchanged
        Product[] sortedProducts = Arrays.copyOf(products, products.length);

        // Binary search requires products to be sorted by productId
        Arrays.sort(
                sortedProducts,
                Comparator.comparingInt(product -> product.productId)
        );

        // Binary search
        Product binaryResult = binarySearch(sortedProducts, targetId);

        if (binaryResult != null) {
            System.out.println("\nBinary Search Result:");
            System.out.println(binaryResult);
        } else {
            System.out.println("Product not found using binary search.");
        }
    }
}