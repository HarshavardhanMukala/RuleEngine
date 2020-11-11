package org.drl.ruleEngine.DroolOrderRuleEngine.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderItems {

	private String orderItemType;
	private String orderItemName;
	
	public OrderItems(String orderItemType, String orderItemName) {
		super();
		this.orderItemType = orderItemType;
		this.orderItemName = orderItemName;
	}
	
	public OrderItems() {
		// TODO Auto-generated constructor stub
	}

	public String getOrderItemType() {
		return orderItemType;
	}
	public void setOrderItemType(String orderItemType) {
		this.orderItemType = orderItemType;
	}
	public String getOrderItemName() {
		return orderItemName;
	}
	public void setOrderItemName(String orderItemName) {
		this.orderItemName = orderItemName;
	}
	
		
}
