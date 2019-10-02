package project;

import java.util.Comparator;

public class DescendingStart extends MyComparator{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o2.getStart().compareTo(o1.getStart());
	}

}
