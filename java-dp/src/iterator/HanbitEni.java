package iterator;

public class HanbitEni implements HanbitEniService{
	private Student[] students;
	private int last = 0;
	public HanbitEni(int size) {
		this.students = new Student[size];
	}
	public void add(Student student){
		this.students[last] = student;
		last++;
	}

	public Student getStudentAt(int index){
		return students[index];
	}
	public int getCount(){
		return last;
	}
	MyIterator it= this.iterator();
	@Override
	public MyIterator iterator() {
		return new HanbitIterator(this);
	}
	public Student searchByName(String findName) {
		
		while (it.hasNext()) {
			Student student = (Student) it.next();
			if (student.getName().equals(findName)) {
				return student;
			}
		
		}
		return null;
	}
	public Student[] SearchBySub(String findSub){
			int count = 0;
			
			while (it.hasNext()) {
				Student student = (Student) it.next();
				if (student.getSubject().equals(findSub)) {
					count++;
				}
				
		}
			Student[] temp = new Student[count];
			count = 0;
			while (it.hasNext()) {
				Student student = (Student) it.next();
				if (student.getSubject().equals(findSub)) {
					temp[count] = student;
					count++;
				}
			}
			return temp;
	}
	
}
