package swapping;

public class NumberSwapping {
	
	public static void main(String[] args) {
		
		int a=10;
		
		int b=20;
		
		System.out.println("Before swappinh values are =  "+a+"   "+b);
		
		
//		//Logic1
//		
//		int t=a;
//		a=b;
//		b=t;
//		System.out.println("After swappinh values are =  "+a+"   "+b);
		
		
//		//Logic2
//		
//		a=a+b;  //30=10+20
//		b=a-b;  //10=30-20
//		a=a-b;  //20=30-10
//		System.out.println("After swappinh values are =  "+a+"   "+b);
		
		
		//Logic3
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swappinh values are =  "+a+"   "+b);
		
		
		 
		
	}

}
