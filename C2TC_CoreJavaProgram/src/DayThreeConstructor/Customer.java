package DayThreeConstructor;

public class Customer {
	private int cid;
	private String cname;
	private String city;
	public Customer()//default constructor
	{
		this.cid=101;
		this.cname="Vinti";
		this.city="chennai";
	}
	public Customer(int cid,String cname,String city)
	//Parameterized constructor
	{
		this.cid=cid;
		this.cname=cname;
		this.city=city;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", city=" + city + "]";
	}
}