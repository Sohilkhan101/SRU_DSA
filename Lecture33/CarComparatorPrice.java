package Lecture33;


import java.util.Comparator;

public class CarComparatorPrice implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
 		return o1.price - o2.price;
	}

}
