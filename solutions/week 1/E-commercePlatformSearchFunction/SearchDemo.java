// Big O notation describes the time complexity of an algorithm by measuring how its execution time grows as the input size increases. It helps compare the efficiency of algorithms regardless of hardware or programming language.

import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName, category;

    Product(int id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }
}

public class SearchDemo {

    // Linear Search
    static Product linearSearch(Product[] products, int id) {
        for (Product p : products)
            if (p.productId == id)
                return p;
        return null;
    }

    // Binary Search
    static Product binarySearch(Product[] products, int id) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (products[mid].productId == id)
                return products[mid];
            if (products[mid].productId < id)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(103, "Shoes", "Fashion"),
            new Product(101, "Phone", "Electronics"),
            new Product(104, "Laptop", "Electronics"),
            new Product(102, "Book", "Education")
        };

        Product p = linearSearch(products, 102);
        System.out.println("Linear: " + (p != null ? p.productName : "Not Found"));

        Arrays.sort(products, Comparator.comparingInt(x -> x.productId));

        p = binarySearch(products, 102);
        System.out.println("Binary: " + (p != null ? p.productName : "Not Found"));
    }
}

// for this e-commerce platform, binary search is better