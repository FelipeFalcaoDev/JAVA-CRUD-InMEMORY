package service;
import repository.ProductRepository;
import model.Product;
import java.util.List;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void createProduct(Product product) {
        //Rules separated by Fail Fast

        if (product == null) {
            throw new IllegalArgumentException("Product null can't be created");
        }
        
        if (product.getId() == null) {
            throw new IllegalArgumentException("Product ID, can't be null");
        }
        
        Product existingProduct = productRepository.findById((long) product.getId());

        if (existingProduct != null) {
            throw new IllegalArgumentException("This product id already exists.");
        }

        productRepository.save(product);
    }

    public List<Product> listProducts() {
        return productRepository.findAll();
    }

    public Product getProductsById(long id) {
        return productRepository.findById(id);
    }

    public void deleteProduct(long id) {
        productRepository.deleteById(id);
    }

    public void updateProduct(Product updatedProduct) {
        if (updatedProduct == null) {
            throw new IllegalArgumentException("Product can't be null");
        }

        if (updatedProduct.getId() == null) {
            throw new IllegalArgumentException("Product ID can't be null for update");
        }

        Product existingProduct = productRepository.findById(updatedProduct.getId());
        if (existingProduct == null) {
            throw new IllegalStateException("Product not found for update");
        }

        existingProduct.setName(updatedProduct.getName());
        existingProduct.setBrand(updatedProduct.getBrand());
        existingProduct.setDescription(updatedProduct.getDescription());
        existingProduct.setCategory(updatedProduct.getCategory());
        existingProduct.setStock(updatedProduct.getStock());
        existingProduct.setValidityDate(updatedProduct.getValidityDate());
        existingProduct.setPrice(updatedProduct.getPrice());
    }
}
