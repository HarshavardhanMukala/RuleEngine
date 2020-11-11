package org.drl.ruleEngine.DroolOrderRuleEngine.service;

import org.drl.ruleEngine.DroolOrderRuleEngine.models.OrderItems;
import org.drl.ruleEngine.DroolOrderRuleEngine.models.PackingSlip;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneratePackingSlip {

	@Autowired
    private KieContainer kContainer;
	
	public Enum generatePackingSlip(OrderItems orderItems,PackingSlip ps) {
		
		KieSession kieSession = kContainer.newKieSession();
        kieSession.setGlobal("packingSlip", ps);
        kieSession.insert(orderItems);
        kieSession.fireAllRules();
        kieSession.dispose();
		return ps.getParty();
	}
}
