package model;
import java.math.BigDecimal;
import java.time.LocalDate;

// * Represents a product with various attributes.
public class Product {
    private Long id;
    private String name;
    private String brand;
    private String description;
    private String category;
    private int stock;
    private LocalDate validityDate;
    private BigDecimal price;

    // * Constructor to initialize a Product object.
    public Product() {

    }

    public Product(Long id, String name, String brand, String description, String category,
    int stock, LocalDate validityDate, BigDecimal price) {
        this.setId(id);
        this.setName(name);
        this.setBrand(brand);
        this.setDescription(description);
        this.setCategory(category);
        this.setStock(stock);
        this.setValidityDate(validityDate);
        this.setPrice(price);
    }

    // * Getters for each atribute
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    public LocalDate getValidityDate() {
        return validityDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    // * Setters for each atribute
    public void setId(Long id) {
        if (id <= 0) { 
            throw new IllegalArgumentException("ID must be greater than zero.");
        }
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be null or empty.");
        }
        this.brand = brand;
    }

    public void setDescription(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Description cannot be null or empty.");
        }
        this.description = description;
    }

    public void setCategory(String category) {
        if (category == null || category.trim().isEmpty()) {
            throw new IllegalArgumentException("Category cannot be null or empty.");
        }
        this.category = category;
    }
    
    public void setStock (int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock cannot be negative.");
        }
        this.stock = stock;
    }

    public void setValidityDate(LocalDate validityDate) {
        LocalDate today = LocalDate.now();
        if (validityDate == null || validityDate.isBefore(today)) {
            throw new IllegalArgumentException("Validity date cannot be null or in the past.");
        }
        this.validityDate = validityDate;
    }

    public void setPrice (BigDecimal price) {
        if (price == null || price.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero.");
        }
        this.price = price;
    }

}
