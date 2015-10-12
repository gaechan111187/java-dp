package iterator;

import java.util.Scanner;
public class HanbitMain {
	public static void main(String[] args) {
		HanbitEni hb = new HanbitEni(10);  // 총정원10명, 반은2개뿐
		hb.add(new Student("빅데이터","길동"));
		hb.add(new Student("빅데이터","유신"));
		hb.add(new Student("빅데이터","순신"));
		hb.add(new Student("자바","순환"));
		hb.add(new Student("자바","준규"));
		hb.add(new Student("자바","성한"));
		hb.add(new Student("자바","혜숙"));
		
		
		Scanner scanner = new Scanner(System.in);
		MyIterator it = hb.iterator();
		
		
		while (true) {
			
			System.out.println("1.학생추가 2.학생조회(유일한값이름) 3.학생조회(과목) 4.총학생수 5.종료");
			switch (scanner.nextInt()) {
			case 1:	System.out.println("반이름과 이름을 입력하시오");
				hb.add(new Student(scanner.next(), scanner.next()));
				break;
			case 2:	System.out.println("조회할 이름을 입력하시오");
					System.out.println(hb.searchByName(scanner.next()));
				break;
			case 3:	System.out.println("조회할 과목을 입력하시오.");
					String findSub = scanner.next();
					System.out.println(hb.SearchBySub(findSub)[0]);
					
				break;
			case 4:	System.out.println("총학생수는 "+hb.getCount()+"명 입니다.");
				break;
			case 5: return;

			default:
				break;
			}
		}
		/**
		 * 1.HanbitEni의 배열버전
		 * 2.HanbitEni의 ArrayList 버전
		 * 3.HanbitEni의 HashMap버전
		 */
	}
}
