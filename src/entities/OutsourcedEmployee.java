package entities;

public class OutsourcedEmployee extends Employee{
	private Double additionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hour, Double valuePerHour, Double addCharge) {
		super(name, hour, valuePerHour);
		this.additionalCharge = addCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
