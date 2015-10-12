package iterator;

public class MultiplexIterator implements MyIterator {
	private Multiplex multiplex ;
	private int index;
	
	public MultiplexIterator(Multiplex multiplex) {
		this.multiplex = multiplex;
		this.index = 0;
	}
	public boolean hasNext() {
		if (index<multiplex.getCount()) {
			return true;
		} else {
			return false;
		}
	}
	public Object next() {
		Movie movie = multiplex.getMovieAt(index);
		index++;
		return movie;
	}
}
