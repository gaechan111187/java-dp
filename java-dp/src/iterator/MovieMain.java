package iterator;

public class MovieMain {
	public static void main(String[] args) {
		Multiplex multiplex = new Multiplex(100);
		multiplex.add(new Movie("사도"));
		multiplex.add(new Movie("마션"));
		multiplex.add(new Movie("인턴"));
		multiplex.add(new Movie("성난변호사"));
		multiplex.add(new Movie("탐정"));
		MyIterator it = multiplex.iterator();
		while (it.hasNext()) {
			Movie movie = (Movie) it.next();
			if (movie.getName().equals("성난변호사")) {
				System.out.print(movie.getName()+"\t");				
			}

		}
		
	}
}
