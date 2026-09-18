import java.io.Serializable;

public class Vehicle implements Serializable{
	private int vNo;
	private String Vname;
	
	public Vehicle(int vNo,String VName) {
		this.Vname=VName;
		this.vNo=vNo;
	}

	@Override
	public String toString() {
		return "Vehicle [vNo=" + vNo + ", Vname=" + Vname + "]";
	}
	
}
