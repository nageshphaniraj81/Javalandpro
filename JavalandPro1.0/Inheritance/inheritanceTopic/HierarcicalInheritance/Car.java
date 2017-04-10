package inheritanceTopic.HierarcicalInheritance;

public class Car extends Vehicle {

	@Override
	String fuel(){
		return "Diesel";
	}
	
	public void superFuel(){
		super.fuel();
		System.out.println(super.fuel());
	}
}
