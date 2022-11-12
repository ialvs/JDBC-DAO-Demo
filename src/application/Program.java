package application;

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
		
		System.out.println("=== TEST 1: seller findByDepartment ===");
		Department department = new Department(2,null);
		List<Seller> sellers = sellerDao.findByDepartment(department);
		
		for (Seller sellersItem : sellers) {
			System.out.println(sellersItem);
		}
	}

}

