package repository;
import java.util.ArrayList;
import java.util.List;
import model.Product;

// * Repository class responsible for managing Product data in memory.
// * This class simulates a database using a List.
public class ProductRepository {
    private List<Product> products = new ArrayList<>();
    
    // * Saves a product in the repository.
    // * In an in-memory scenario, this simply adds the product to the list
    public void save(Product product) {
        products.add(product);
    }

    // * Retrieves all products stored in the repository.
    public List<Product> findAll() {
        return products;
    }

    // * Searches for a product by its ID.
    // * Iterates through the list and returns the first product that matches the given ID.
    public Product findById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    // * Deletes a product from the repository based on its ID.
    // * Uses removeIf to remove any product with the matching ID.
    public void deleteById(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

}