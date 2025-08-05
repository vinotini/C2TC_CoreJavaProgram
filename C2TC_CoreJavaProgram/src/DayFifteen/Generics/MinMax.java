package DayFifteen.Generics;

//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}
