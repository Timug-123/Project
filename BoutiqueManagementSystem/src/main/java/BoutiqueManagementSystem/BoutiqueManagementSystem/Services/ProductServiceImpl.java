package BoutiqueManagementSystem.BoutiqueManagementSystem.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import BoutiqueManagementSystem.BoutiqueManagementSystem.DAO.ProductDAO;
import BoutiqueManagementSystem.BoutiqueManagementSystem.model.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
    private ProductDAO productDao;	
	
	
	@Override
	public void saveProduct(Product prdt) {
		productDao.saveProduct(prdt);	
	}

	@Override
	public List<Product> getAllProduct() {
		return productDao.getAllProduct();
	}

	@Override
	public Product getProductById(int prdtId) {
		
		return productDao.getProductById(prdtId);
	}

	@Override
	public void updateProduct(Product prdtId) {
		productDao.updateProduct(prdtId);
		
	}

	@Override
	public void deleteProduct(int prdtId) {
		productDao.deleteProduct(prdtId);
		
	}

}
