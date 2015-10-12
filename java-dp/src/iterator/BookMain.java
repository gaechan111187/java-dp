package iterator;

public class BookMain {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(100);  //100권을 담을 수 있는 책장(담겨있는것은 아니다)
		bookShelf.add(new Book("자바의정석"));
		bookShelf.add(new Book("디자인패턴"));
		bookShelf.add(new Book("오라클문법"));
		bookShelf.add(new Book("JSP프로그래밍"));
		MyIterator it = bookShelf.iterater();  // 얕은 카피(shallow copy) iterater 기능만 카피함
		while (it.hasNext()) {
			Book book = (Book) it.next();
			if (book.getName().equals("자바의정석")) {
				System.out.print(book.getName()+"\t");				
			}

		}
	}
}
