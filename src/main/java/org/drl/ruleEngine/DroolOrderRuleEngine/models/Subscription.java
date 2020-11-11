package org.drl.ruleEngine.DroolOrderRuleEngine.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Subscription {

	private boolean MembershipActivation;
	private boolean MembershipUpgrade;
	
	public boolean isMembershipActivation() {
		return MembershipActivation;
	}
	public void setMembershipActivation(boolean membershipActivation) {
		MembershipActivation = membershipActivation;
	}
	public boolean isMembershipUpgrade() {
		return MembershipUpgrade;
	}
	public void setMembershipUpgrade(boolean membershipUpgrade) {
		MembershipUpgrade = membershipUpgrade;
	}
	
}
