public class ParsInt1 {

	public static void main(String[] args) {

		int sum=0;
		for (int i = 0; i < args.length; i++) {
			
			char a = Character.parseChar(args[i]);
			
			sum=sum+a;
		}
		System.out.println(sum);
	}

}