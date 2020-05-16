package domain;

import java.util.ArrayList;
import java.util.List;

public class Number {

	private double value;
	

	public double getValue() {
		return value;
		
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Number() {
		super();
	}

	public static List<Number> createRandomList(double n) {
		List<Number> list = new ArrayList();
		for (int i = 1; i < n; i++) {
			
			int k =  (int) (Math.random()*100000);
			Number number = new Number();
			number.setValue(k);
			list.add(number);

		}
		
		return list;

	}

	public static List<Number> createOrderedList(double n) {
		List<Number> list = new ArrayList();
		
		for (int i = 1; i < n; i++) {
			Number number = new Number();
			number.setValue(i);
			list.add(number);
		}
		
		return list;

	}
	
	public static double logBaseN(int x, int n)
	{
	    return (Math.log(x) / Math.log(n));
	}

	@Override
	public String toString() {
		return "Number [value=" + value + "]";
	}

}
