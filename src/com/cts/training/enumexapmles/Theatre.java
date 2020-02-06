package com.cts.training.enumexapmles;

public enum Theatre {
	GOLD,
	SILVER,
	ELITE;
	
	public float cost;
	
	private Theatre() {
		this.cost=200.0f;
	}
	
	public float getCost() {
		if(this==GOLD)
			return cost;
		else
			if(this==SILVER)
				return cost-50;
			else
				return cost-100;
		
	}
}

