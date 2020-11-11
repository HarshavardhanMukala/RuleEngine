package org.drl.ruleEngine.DroolOrderRuleEngine;

import org.drl.ruleEngine.DroolOrderRuleEngine.models.OrderItems;
import org.drl.ruleEngine.DroolOrderRuleEngine.models.PackingSlip;
import org.drl.ruleEngine.DroolOrderRuleEngine.service.GeneratePackingSlip;
import org.drl.ruleEngine.DroolOrderRuleEngine.service.impl.GeneratePackingSlipImpl;
import org.drl.ruleEngine.DroolOrderRuleEngine.service.OutputConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationRunner
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new AnnotationConfigApplicationContext(OutputConfiguration.class);
    	 GeneratePackingSlipImpl generatePackingSlip = (GeneratePackingSlipImpl) context.getBean(GeneratePackingSlipImpl.class);
    	 OrderItems orderItems = new OrderItems("physicalProduct","Mobile");
    	 PackingSlip ps = new PackingSlip();
    	 generatePackingSlip.generatePackingSlip(orderItems, ps);
    }
}
