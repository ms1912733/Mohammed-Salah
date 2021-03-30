
public class RealEstate extends Rentable {
	private String type;
	private String location;
	private int monthlyPrice;

	public RealEstate(String number, String type, String location, int monthlyPrice) {
		super(number);
		this.type = type;
		this.location = location;
		this.monthlyPrice = monthlyPrice;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getMonthlyPrice() {
		return monthlyPrice;
	}

	public void setMonthlyPrice(int monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
	}


}
