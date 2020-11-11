package org.drl.ruleEngine.DroolOrderRuleEngine;

import static org.junit.Assert.*;

import org.drl.ruleEngine.DroolOrderRuleEngine.models.OrderItems;
import org.drl.ruleEngine.DroolOrderRuleEngine.models.PackingSlip;
import org.drl.ruleEngine.DroolOrderRuleEngine.models.PartyDetails;
import org.drl.ruleEngine.DroolOrderRuleEngine.service.OutputConfiguration;
import org.drl.ruleEngine.DroolOrderRuleEngine.service.impl.GeneratePackingSlipImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = OutputConfiguration.class)
public class AppTest {

	@Autowired
	private GeneratePackingSlipImpl generatePackingSLip;

	@Test
	public void whenNightSurchargeFalseAndDistanceLessThan10_thenFixFareWithoutNightSurcharge() {
		OrderItems orderItems = new OrderItems("physicalProduct", "Mobile");
		PackingSlip ps = new PackingSlip();
		generatePackingSLip.generatePackingSlip(orderItems, ps);
		assertEquals(PartyDetails.SHIPPING_PARTY, PackingSlip.getParty());
	}
}
