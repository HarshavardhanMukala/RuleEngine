package org.drl.ruleEngine.DroolOrderRuleEngine.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmailGenerator {

	//Email generation code can go here
	private boolean SendEmail;
	
	public boolean isSendEmail() {
		return SendEmail;
	}

	public void setSendEmail(boolean sendEmail) {
		SendEmail = sendEmail;
	}

	public void GenerateEmail() {
		//Email generation code goes here
		System.out.println("Email Sent to Owner");
	}
}
