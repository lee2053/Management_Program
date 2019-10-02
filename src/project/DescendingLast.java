package project;

import java.util.Comparator;

public class DescendingLast extends MyComparator{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o2.getLast().compareTo(o1.getLast());
	}

}
