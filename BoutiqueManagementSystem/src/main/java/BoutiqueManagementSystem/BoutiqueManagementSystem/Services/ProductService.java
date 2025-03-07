package BoutiqueManagementSystem.BoutiqueManagementSystem.Services;

import java.util.List;

import BoutiqueManagementSystem.BoutiqueManagementSystem.model.Product;

public interface ProductService {
	void saveProduct(Product prdt);
    List<Product> getAllProduct();
    Product getProductById(int prdtId);
    void updateProduct(Product prdtId);
    void deleteProduct(int prdtId);
}
