package ReverseEvenWords;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String name="my name is srikanth";
		 System.out.println(name.length());
		
		 String a[]=name.split(" ");
		 System.out.println(a[3]);
		
		 
		 for(int i=a.length-1;i>=0;i--) {
			 
			 System.out.print(a[i]+" ");
		 }
		 
		 
		
	}

}
