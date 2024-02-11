package comarun.main;

public class Product {
	
	private String pName;
	private String pId;
	
	public Product()
	{
	
	}
	
	public Product(String pName, String pId) {
		super();
		this.pName = pName;
		this.pId = pId;
	}
	
	@Override
	public String toString() {
		return "Product [pName=" + pName + ", pId=" + pId + "]";
	}

	public String getpName() {
		return pName;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public String getpId() {
		return pId;
	}
	
	public void setpId(String pId) {
		this.pId = pId;
	}
	
	

}
