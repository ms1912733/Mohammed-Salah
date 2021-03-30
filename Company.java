
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

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
}
