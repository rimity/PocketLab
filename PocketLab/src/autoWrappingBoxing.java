public class autoWrappingBoxing {
	
	public static void main(String[] args){
		Integer I = Integer.valueOf(5);
		System.out.println("I in main @value : " + I );
		methodA(I);
		System.out.println("I in main atfer methodA @value : " + I );
	}
	public static void methodA(Integer I){
		Integer A = I;
		System.out.println("I in methodA @value : " + I + "    A in methodA @value : " + A);
		I++;   //this I is another Integer object
		System.out.println("I in methodA after I++ @value : " + I + "    A in methodA @value : " + A);
	}
}
