package com.simon.flyweight;
/**
 * ��Ԫ��
 * @author Administrator
 *
 */
public interface ChessFlyWeight {
	void setColor(String c);
	String getColor();
	void display(Coordinate c);
}

class ConcreteChess implements ChessFlyWeight {

	private String color;
	
	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String c) {
		color = c;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void display(Coordinate c) {
		System.out.println("������ɫ");
		System.out.println("����λ��" + c.getX() + "----" + c.getY());
	}
	
}