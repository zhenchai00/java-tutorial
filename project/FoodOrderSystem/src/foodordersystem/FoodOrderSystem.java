package foodordersystem;

import foodordersystem.Model.DataIO;
import foodordersystem.Page.AdminDashboardPage;
import foodordersystem.Page.CustomerDashboardPage;
import foodordersystem.Page.LoginPage;
import foodordersystem.Page.NewOrderPage;
import foodordersystem.Page.OrderCartPage;
import foodordersystem.Page.OrderPage;
import foodordersystem.Page.RegisterUserPage;
import foodordersystem.Page.RunnerDashboardPage;
import foodordersystem.Page.VendorDashboardPage;

public class FoodOrderSystem {
	public static LoginPage loginPage;
	public static RegisterUserPage registerUserPage;

	public static AdminDashboardPage adminDashboardPage;
	public static CustomerDashboardPage	customerDashboardPage;
	public static VendorDashboardPage vendorDashboardPage;
	public static RunnerDashboardPage runnerDashboardPage;

	public static OrderPage orderPage;
	public static NewOrderPage newOrderPage;
	public static OrderCartPage orderCartPage;
	public static void main(String[] args) {
		DataIO.readData();

		loginPage = new LoginPage();
		registerUserPage = new RegisterUserPage();

		adminDashboardPage = new AdminDashboardPage();
		customerDashboardPage = new CustomerDashboardPage();
		vendorDashboardPage = new VendorDashboardPage();
		runnerDashboardPage = new RunnerDashboardPage();

		orderPage = new OrderPage();
		newOrderPage = new NewOrderPage();
		orderCartPage = new OrderCartPage();
		
	}
}
