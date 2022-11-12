package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDAO sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(1);
		
		System.out.println(seller);
		
		System.out.println("=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2,null);
		List<Seller> sellers = sellerDao.findByDepartment(department);
		
		for (Seller sellersItem : sellers) {
			System.out.println(sellersItem);
		}
		
		System.out.println("=== TEST 3: seller findAll ===");
		sellers = sellerDao.findAll();
		
		for (Seller sellersItem : sellers) {
			System.out.println(sellersItem);
		}
		
		System.out.println("=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null,"Greg Red","greg@gmail.com",new Date(),4000.0,department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		
		System.out.println("=== TEST 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Black");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		
		System.out.println("=== TEST 6: seller update ===");
		sellerDao.deleteById(8);
		System.out.println("Delete completed");
	}

}

