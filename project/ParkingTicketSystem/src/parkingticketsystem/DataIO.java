package parkingticketsystem;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DataIO {
	public static ArrayList<Customer> allCustomers = new ArrayList<Customer>();
	
	public static void read(){
		try{
			Scanner s1 = new Scanner(new File("customer.txt"));
			while(s1.hasNext()){
				String name = s1.nextLine();
				int password = Integer.parseInt(s1.nextLine());
				s1.nextLine();
				allCustomers.add(new Customer(name, password));
			}
		}catch(Exception x){
			System.out.println("Error in read ..........");
		}
	}
	
	public static void write(){
		try{
			PrintWriter p1 = new PrintWriter("customer.txt");
			for(Customer c : allCustomers){
				p1.println(c.getName());
				p1.println(c.getPassword());
				p1.println();
			}
			p1.close();
		}catch(Exception x){
			System.out.println("Error in write ..........");
		}
	}
}
