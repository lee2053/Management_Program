package project;

import java.util.Comparator;

public class AscendingLast extends MyComparator{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getLast().compareTo(o2.getLast());
	}

}


