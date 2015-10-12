package iterator;

public class HanbitIterator implements MyIterator {
	private HanbitEni hanbitEni ;
	private int index;
	
	public HanbitIterator(HanbitEni hanbitEni) {
		this.hanbitEni = hanbitEni;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index<hanbitEni.getCount()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Student student = hanbitEni.getStudentAt(index);
		index++;
		return student;
	}
	
}
