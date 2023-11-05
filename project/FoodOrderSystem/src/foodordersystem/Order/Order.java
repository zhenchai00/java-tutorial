package foodordersystem.Order;

import java.io.*;

public class Order {

	/**
	 * Type of order option
	 */
	public enum Type {
		DINEIN,
		TAKEAWAY,
		DELIVERY
	};

	/**
	 * Refund status
	 */
	public enum Refund {
		YES,
		NO
	}

	/**
	 * Order status
	 */
	public enum Status {
		PENDING,
		ACCEPT,
		REJECT,
		PROCESSING,
		HANDOVER,
		COMPLETED
	}

	private int id;
	private int invoiceId;
	private int customerId;
	private String address;
	private String date;
	private Type type;
	private Refund refund;
	private Status status;

	/**
	 * Constructor
	 * @param id
	 * @param invoiceId
	 * @param customerId
	 * @param address
	 * @param date
	 * @param type
	 * @param refund
	 * @param status 
	 */
	public Order(
			int id,
			int invoiceId,
			int customerId,
			String address,
			String date,
			Type type,
			Refund refund,
			Status status
	) {
		this.invoiceId = invoiceId;
		this.customerId = customerId;
		this.address = address;
		this.date = date;
		this.type = type;
		this.refund = refund;
		this.status = status;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return date;
	}
	public void setType(Type type) {
		this.type = type;
	}

	public Type getType() {
		return type;
	}

	public void setRefund(Refund refund) {
		this.refund = refund;
	}

	public Refund getRefund() {
		return refund;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}
}
