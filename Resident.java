
public class Resident extends Customer {
	private int residence;
	private String passportNo;
	private String nationality;
	private Date bDate;
	
	public Resident(int id, String name, int residence, String passportNo, String nationality, Date bDate) {
		super(id, name);
		this.residence = residence;
		this.passportNo = passportNo;
		this.nationality = nationality;
		this.bDate = bDate;
	}

	public int getResidence() {
		return residence;
	}

	public void setResidence(int residence) {
		this.residence = residence;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getbDate() {
		return bDate;
	}

	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}

	
}
