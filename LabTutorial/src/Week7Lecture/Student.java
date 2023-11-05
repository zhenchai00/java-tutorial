/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week7Lecture;

/**
 *
 * @author GIGABYTE
 */
public class Student {
	private String name;
	private Account money;	// composition
	private Hostel house;	// aggregation
	private Car mycar;		//association
	
	public Student(String stdName, int accNo, double accBalance, Hostel stdHouse) {
		name = stdName;
		money = new Account(accNo, accBalance);
		house = stdHouse;
	}
	
	public void setCar(Car stdCar) {
		mycar = stdCar;
	}
	
	public String toString() {
		String x = name + money + house;
		if (mycar != null) {
			x += mycar;
		}
		return x;
	}
}
