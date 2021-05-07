package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "LIVROS");
		
		Seller sell = new Seller(21, "Buceto", "buceto@gmail.com", new Date(), 4000.0, obj);
		
		System.out.println(obj);
		System.out.println(sell);
	}

}
