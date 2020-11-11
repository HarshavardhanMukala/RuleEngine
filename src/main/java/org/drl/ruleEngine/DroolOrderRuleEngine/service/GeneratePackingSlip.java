package org.drl.ruleEngine.DroolOrderRuleEngine.service;

import org.drl.ruleEngine.DroolOrderRuleEngine.models.OrderItems;
import org.drl.ruleEngine.DroolOrderRuleEngine.models.PackingSlip;

public interface GeneratePackingSlip {

	Enum generatePackingSlip(OrderItems orderItems,PackingSlip ps);
}
