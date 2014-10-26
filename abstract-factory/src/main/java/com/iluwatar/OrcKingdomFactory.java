package com.iluwatar;

/**
 * 
 * Concrete factory.
 * 
 */
public class OrcKingdomFactory implements KingdomFactory {

	public Castle createCastle() {
		return new OrcCastle();
	}

	public King createKing() {
		return new OrcKing_Ab_Fcty();
	}

	public Army createArmy() {
		return new OrcArmy();
	}

}
