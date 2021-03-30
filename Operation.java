public class Operation {
	private Customer customer;
	private Rentable rent;
	private Date operationDate;
	private String type;
	public Operation(Customer customer, Rentable rent, Date operationDate, String type) {
		this.customer = customer;
		this.rent = rent;
		this.operationDate = operationDate;
		this.type = type;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Rentable getRent() {
		return rent;
	}
	public void setRent(Rentable rent) {
		this.rent = rent;
	}
	public Date getOperationDate() {
		return operationDate;
	}
	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}



}
