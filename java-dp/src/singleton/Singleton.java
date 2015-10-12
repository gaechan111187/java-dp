package singleton;

public class Singleton {
	private static Singleton instance = new Singleton();

	public static Singleton getInstance() {
		return instance;
	}
	public void test() {
		System.out.println("싱글톤"); // 연관관계가 깊어진다
		// return으로 결과를 전달해 버리면 연관관계가 얉아진다. ->loose coupling
	}
}
