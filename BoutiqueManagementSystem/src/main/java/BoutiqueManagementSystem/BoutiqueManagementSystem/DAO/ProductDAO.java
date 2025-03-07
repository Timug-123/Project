package BoutiqueManagementSystem.BoutiqueManagementSystem.DAO;

import java.util.List;

import BoutiqueManagementSystem.BoutiqueManagementSystem.model.Product;


public interface ProductDAO {
	void saveProduct(Product prod);
    List<Product> getAllProduct();
    Product getProductById(int prdtId);
    void updateProduct(Product prod);
    void deleteProduct(int prdtId);
}
