package Hello;

public class Exception_Handling_Concept {
	public static void main(String[] args) {
		int a =10;
		System.out.println("Execution started");
		try {
			System.out.println(a/0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Execution Completed");

		}
	}

}
