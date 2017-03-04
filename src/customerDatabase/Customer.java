package customerDatabase;

public class Customer implements ICustomer, Comparable<Customer>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getIDNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getKilometers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setKilometers() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		if (this.getKilometers() < o.getKilometers() ){
			return -1;
		}
		else{
			if(this.getKilometers() > o.getKilometers()){
				return +1;
			}
		}
		return 0;
	}

}
