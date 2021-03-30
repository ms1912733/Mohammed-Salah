public class Car extends Rentable {
	int plateNo;
	String brand;
	int model;
	int monthlyPrice;
	
	public Car(String number, int plateNo, String brand, int model, int monthlyPrice) {
		super(number);
		this.plateNo = plateNo;
		this.brand = brand;
		this.model = model;
		this.monthlyPrice = monthlyPrice;
	}

	public int getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(int plateNo) {
		this.plateNo = plateNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getMonthlyPrice() {
		return monthlyPrice;
	}

	public void setMonthlyPrice(int monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
	}
	
}
