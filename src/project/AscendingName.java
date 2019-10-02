package project;

import java.util.Comparator;

public class AscendingName extends MyComparator{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
