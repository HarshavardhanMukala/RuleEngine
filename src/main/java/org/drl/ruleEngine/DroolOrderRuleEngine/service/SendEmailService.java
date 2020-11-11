package org.drl.ruleEngine.DroolOrderRuleEngine.service;

import org.drl.ruleEngine.DroolOrderRuleEngine.models.OrderItems;
import org.drl.ruleEngine.DroolOrderRuleEngine.models.PackingSlip;

public interface SendEmailService {

	void generateEmailtoOwner(OrderItems orderItems);
}
