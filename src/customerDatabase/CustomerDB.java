package customerDatabase;

import java.util.HashMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CustomerDB {
	
	private HashMap<Integer, Customer> map = new HashMap<>();
	private TreeSet<Customer> tree = new TreeSet<>();
	
	public void addCustomer(Customer customersToAdd) {
		map.put(customersToAdd.getIDNumber(),customersToAdd);
		tree.add(customersToAdd);
	}
	
	public int numberOfCustomers()
	{
		return map.size();
	}
	
	public Customer getCustomerByID(int ID){
		return map.get(ID);
	}
	
	public Set<Customer> getCustomersByKmRange(double from){
		for(Customer c:tree) if (c.getKilometers() > from )
			return tree.tailSet(c);
		return null;
	}
	
	public SortedSet<Customer> sort(){
		return tree;
	}
	
	public SortedSet<Customer> sortDescending(){
		return tree.descendingSet();
	}

}
