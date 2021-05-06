package entitites;

import abstracts.IEntity;

public class Campaign implements IEntity{
	
	private int id;
	private String name;
	private String detail;
	private int discountRate;
	
	
	public Campaign () {}


	public Campaign(int id, String name, String detail, int discountRate) {
		super();
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.discountRate = discountRate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	public int getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	

}
