package com.iluwatar;

/**
 * 
 * Makes requests that are handled by the chain.
 * 
 */
public class OrcKing_Chain {

	RequestHandler chain;

	public OrcKing_Chain() {
		buildChain();
	}

	private void buildChain() {
		chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
	}

	public void makeRequest(Request req) {
		chain.handleRequest(req);
	}

}
