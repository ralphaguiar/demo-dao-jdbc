package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		//Department obj = new Department(1, "LIVROS");
		
		//Seller sell = new Seller(21, "Buceto", "buceto@gmail.com", new Date(), 4000.0, obj);
		
		// >>>>> Injeção de dependência ****** <<<<< 
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== TESTE 1 Seller findById ====");
		
		Seller sell = sellerDao.findByid(3);
		
		//System.out.println(obj);
		System.out.println(sell);
		
		System.out.println("\n==== TESTE 2 Seller findByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n==== TESTE 3 Seller findAll ====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}

}
