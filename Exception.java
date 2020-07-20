public class Exception {
	public static void main(String[] args) {
  
		try {
			System.out.println("I am in try block");
			System.out.println(3/0);
			System.out.println("Hello");
		}catch(ArithmeticException e){
			System.out.println("Exception:"+e.getMessage());
		}
	}
}
