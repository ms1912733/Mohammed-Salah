
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

}
