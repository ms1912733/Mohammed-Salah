public class Company extends Customer {
	private String licenseNo;
	private String location;
	private Date expiryDate;
	
	public Company(int id, String name, String licenseNo, String location, Date expiryDate) {
		super(id, name);
		this.licenseNo = licenseNo;
		this.location = location;
		this.expiryDate = expiryDate;
	}
	
}
