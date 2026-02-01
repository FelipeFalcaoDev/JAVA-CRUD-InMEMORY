import repository.ProductRepository;
import service.ProductService;
import model.Product;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);

        Product product1 = new Product();
        product1.setId(1l);
        product1.setName("Tênis");
        product1.setBrand("Adidas");    
        product1.setDescription("Tênis esportivo para corridas");
        product1.setCategory("Calçados");
        product1.setStock(3);
        product1.setValidityDate(LocalDate.of(2030,6,24));
        product1.setPrice(new BigDecimal("79.99"));

        Product product2 = new Product();
        product2.setId(2l);
        product2.setName("Tênis");
        product2.setBrand("Nike");    
        product2.setDescription("Tênis esportivo para corridas");
        product2.setCategory("Calçados");
        product2.setStock(4);
        product2.setValidityDate(LocalDate.of(2035,9,25));
        product2.setPrice(new BigDecimal("109.99"));

        // * Create Products 
        try {
            service.createProduct(product1);
            service.createProduct(product2);
            System.out.println("Produtos Cadastrados com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar produto: "+ e.getMessage());
        }        

        // * Delete Products from the list by ID
        try {
            service.deleteProduct(2L); 
            System.out.println("Produto removido com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao deletar produto: " + e.getMessage());
        }

        // * Filter Products from the list by ID
        try {
            Product p = service.getProductsById(2L);
            System.out.println("Produto consultado com sucesso!");
            System.out.println(
                "ID: " + p.getId() + 
                ", Nome: " + p.getName() + 
                ", Marca: " + p.getBrand() +
                ", Descrição: " + p.getDescription() +
                ", Categoria: " + p.getCategory() +
                ", Estoque: " + p.getStock() +
                ", Vencimento: " + p.getValidityDate() +     
                ", Preço: " + p.getPrice()
            );
        } catch (Exception e) {
            System.out.println("Erro ao consultar produto: "+ e.getMessage());
        }

        // * Show all the products list
        System.out.println("\nListando todos os produtos cadastrados:");
        for (Product p : service.listProducts()) {
        System.out.println
        (
        "ID: " + p.getId() + 
        ", Nome: " + p.getName() + 
        ", Marca: " + p.getBrand() +
        ", Descrição: " + p.getDescription() +
        ", Categoria: " + p.getCategory() +
        ", Estoque: " + p.getStock() +
        ", Vencimento: " + p.getValidityDate() +     
        ", Preço: " + p.getPrice());
        }

        // * Update products by the ID
        try {
            Product updatedProduct = new Product();
            updatedProduct.setId(null); // ID existente
            updatedProduct.setName("Tênis Super");
            updatedProduct.setBrand("Adidas");
            updatedProduct.setDescription("Tênis esportivo atualizado");
            updatedProduct.setCategory("Calçados");
            updatedProduct.setStock(5);
            updatedProduct.setValidityDate(LocalDate.of(2031, 6, 24));
            updatedProduct.setPrice(new BigDecimal("89.99"));

            service.updateProduct(updatedProduct);
            System.out.println("Produto atualizado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao atualizar produto: " + e.getMessage());
        }
    }
}
