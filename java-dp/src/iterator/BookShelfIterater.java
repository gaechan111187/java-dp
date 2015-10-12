package iterator;

public class BookShelfIterater implements MyIterator {
	private BookShelf bookShelf; // 필드에 dest(대상 클래스 고정함)
	private int index;

	public BookShelfIterater(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;   //조회 인덱스는 0값
	}

	public boolean hasNext() {
		if (index < bookShelf.getCount()) { // 배열이 가지고 있는 실제 요소갯수
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
