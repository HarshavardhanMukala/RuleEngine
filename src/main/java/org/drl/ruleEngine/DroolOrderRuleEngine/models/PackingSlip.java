package org.drl.ruleEngine.DroolOrderRuleEngine.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PackingSlip {

	private static PartyDetails party;
	private List<String> items;

	public static Enum getParty() {
		return party;
	}

	public void setParty(PartyDetails party) {
		this.party = party;
	}
	
	public void AddItems(String item) {
		this.items.add(item);
	}
	
}
