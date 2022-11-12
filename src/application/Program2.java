package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDAO depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department insert ===");
		Department dep = new Department(null,"Dices");
		/*depDao.insert(dep);
		System.out.println();
		System.out.println("Inserted! New id = " + dep.getId());*/
		
		
		System.out.println("=== TEST 2: department update ===");
		dep = depDao.findById(6);
		dep.setName("Bananas");
		depDao.update(dep);
		System.out.println("Update completed");
		
		System.out.println("=== TEST 3: department delete ===");
		depDao.deleteById(9);
		System.out.println("Delete completed");
		
		System.out.println("=== TEST 4: department findById ===");
		dep = depDao.findById(2);
		System.out.println(dep);
		
		System.out.println("=== TEST 5: department findAll ===");
		List<Department> departments = depDao.findAll();
		
		for (Department department : departments) {
			System.out.println(department);
		}

	}

}
