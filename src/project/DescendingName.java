package project;

import java.util.Comparator;

public class DescendingName extends MyComparator{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());
	}

}
