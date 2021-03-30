
public class Citizen extends Customer{
	private int nationalNo;
	private Date bDate;
	
	public Citizen(int id, String name, int nationalNo, Date bDate) {
		super(id, name);
		this.nationalNo = nationalNo;
		this.bDate = bDate;
	}

	public int getNationalNo() {
		return nationalNo;
	}

	public void setNationalNo(int nationalNo) {
		this.nationalNo = nationalNo;
	}

	public Date getbDate() {
		return bDate;
	}

	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}
	
	
	}

