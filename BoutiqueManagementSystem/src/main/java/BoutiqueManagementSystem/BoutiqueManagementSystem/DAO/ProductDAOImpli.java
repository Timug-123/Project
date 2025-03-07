package BoutiqueManagementSystem.BoutiqueManagementSystem.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import BoutiqueManagementSystem.BoutiqueManagementSystem.model.Product;

@Repository
public class ProductDAOImpli implements ProductDAO {

	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public void saveProduct(Product prod) {
		sessionFactory.getCurrentSession().saveOrUpdate(prod);
		
	}

	@Override
	public List<Product> getAllProduct() {
		
		return sessionFactory.getCurrentSession().createQuery("from Product",Product.class).list();
	}

	@Override
	public Product getProductById(int prdtId) {
		
		return sessionFactory.getCurrentSession().get(Product.class, prdtId);
	}

	@Override
	public void updateProduct(Product prod) {
		
		sessionFactory.getCurrentSession().update(prod);
		
	}

	@Override
	public void deleteProduct(int prdtId) {
		
		Product prod = getProductById(prdtId);
        if (prod != null) {
            sessionFactory.getCurrentSession().delete(prod);
        }
		
	}

}
