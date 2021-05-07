package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		//Department obj = new Department(1, "LIVROS");
		
		//Seller sell = new Seller(21, "Buceto", "buceto@gmail.com", new Date(), 4000.0, obj);
		
		// Inje��o de depend�ncia
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller sell = sellerDao.findByid(3);
		
		//System.out.println(obj);
		System.out.println(sell);
	}

}
