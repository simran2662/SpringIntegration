package com.springintegration;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Order")
public class Order {
	    @Id
	    private String id;
	    private String orderNumber;
	    private String customerName;
	    private List<OrderItem> items;
	    private String status;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getOrderNumber() {
			return orderNumber;
		}
		public void setOrderNumber(String orderNumber) {
			this.orderNumber = orderNumber;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public List<OrderItem> getItems() {
			return items;
		}
		public void setItems(List<OrderItem> items) {
			this.items = items;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public Order(String id, String orderNumber, String customerName, List<OrderItem> items, String status) {
			super();
			this.id = id;
			this.orderNumber = orderNumber;
			this.customerName = customerName;
			this.items = items;
			this.status = status;
		}
		public Order() {
			super();
		}
		@Override
		public String toString() {
			return "Order [id=" + id + ", orderNumber=" + orderNumber + ", customerName=" + customerName + ", items="
					+ items + ", status=" + status + "]";
		}
	    
}



