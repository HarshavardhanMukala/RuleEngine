package org.drl.ruleEngine.DroolOrderRuleEngine.service.impl;

import org.drl.ruleEngine.DroolOrderRuleEngine.models.OrderItems;
import org.drl.ruleEngine.DroolOrderRuleEngine.service.SendEmailService;

public class SendEmailServiceImpl implements SendEmailService {

	@Override
	public void generateEmailtoOwner(OrderItems orderItems) {
		// TODO Auto-generated method stub
		System.out.println("Email sent to Owner");
	}

}
