package foodordersystem;

import foodordersystem.Page.NewOrderPage;
import foodordersystem.Page.OrderCartPage;
import foodordersystem.Page.OrderPage;

public class FoodOrderSystem {
	public static OrderPage orderPage;
	public static NewOrderPage newOrderPage;
	public static OrderCartPage orderCartPage;
	public static void main(String[] args) {
		orderPage = new OrderPage();
		newOrderPage = new NewOrderPage();
		orderCartPage = new OrderCartPage();
	}
}
