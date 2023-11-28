package foodordersystem;

import foodordersystem.Model.DataIO;
import foodordersystem.Page.LoginPage;
import foodordersystem.Page.NewOrderPage;
import foodordersystem.Page.OrderCartPage;
import foodordersystem.Page.OrderPage;
import foodordersystem.Page.RegisterUserPage;

public class FoodOrderSystem {
	public static LoginPage loginPage;
	public static RegisterUserPage registerUserPage;


	public static OrderPage orderPage;
	public static NewOrderPage newOrderPage;
	public static OrderCartPage orderCartPage;
	public static void main(String[] args) {
		DataIO.readData();

		loginPage = new LoginPage();
		registerUserPage = new RegisterUserPage();

		orderPage = new OrderPage();
		newOrderPage = new NewOrderPage();
		orderCartPage = new OrderCartPage();
		
	}
}
