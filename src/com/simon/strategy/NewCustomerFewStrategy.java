package com.simon.strategy;

public class NewCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("������,ԭ��");
		return standardPrice;
	}
	
	
}
