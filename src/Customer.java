public abstract class Customer
{
    String name;
	double amount;
	
	Customer(String name, double amount){
		this.name = name;
		this.amount = amount;
	}
	
	void setName(String name){
		this.name = name;
	}
	
	String getName(){
		return name;
	}
	
	abstract double calculateBill();
}
