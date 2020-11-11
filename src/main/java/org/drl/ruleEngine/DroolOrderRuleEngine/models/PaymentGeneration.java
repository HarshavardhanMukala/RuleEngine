package org.drl.ruleEngine.DroolOrderRuleEngine.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentGeneration {

	private int commissionPercentage;

	public int getCommissionPercentage() {
		return commissionPercentage;
	}

	public void setCommissionPercentage(int commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}
	
	public void GenerateCommision() {
		//commission calculation goes here
		System.out.println("Commision applied");
	}
}
