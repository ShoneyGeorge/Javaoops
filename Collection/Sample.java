package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample {
	// Methods in list-size(),remove(index),addAll(),removeAll(),clear(),contains(),get()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList S = new ArrayList(); // non generic
		ArrayList<String> s = new ArrayList();
		ArrayList<Integer> I = new ArrayList();
		I.add(1000);
		s.add("Sho");
		S.add("Shoney");
		S.add(10);
		S.add(11.23);
		System.out.println(S);
		System.out.println("Size " + S.size());
		System.out.println("Generic List" + s);
		System.out.println(I);
		List<Integer> list = new ArrayList();
		list.add(20000);
		list.add(0, 30000);
		System.out.println("List" + list);

		ArrayList<Integer> sample = new ArrayList();
		sample.add(98);
		sample.add(345);
		sample.add(56);
		sample.add(78);
		sample.add(54);
		System.out.println(sample);
		sample.remove(2);
		System.out.println("After removing index(2),Sample= " + sample);

		System.out.println("Size of sample " + sample.size());
		List<Integer> sample1 = new ArrayList();
		sample1.addAll(sample);
		System.out.println("New list " + sample1);
		System.out.println("Value in index 2 " + sample1.get(2));
		boolean contain = sample1.contains(100000);
		System.out.println("Contains value  " + contain);

		System.out.println("Get method " + sample1.get(1));
		Iterator itr=sample1. iterator();
		//Iterator-interface,iterator-method
		System.out.println("Iterator usage");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			//itr.remove();
			//System.out.println(sample1);

		}
		System.out.println("After remove method");
		itr.remove();
		System.out.println(sample1);
		//System.out.println("Get method out of index " + sample1.get(5));

		// sample1.clear();
		//sample1.removeAll(sample1);
		//System.out.println("New list after clear " + sample1);

	}

}
