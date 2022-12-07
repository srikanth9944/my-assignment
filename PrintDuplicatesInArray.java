package assginment3;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		
		int[] arr= {12,13,14,15,16,12,11,17,19,};
		
		int arrlength=arr.length;
		
	for (int i = 0; i < arr.length-1; i++) {
		int count=1;
		
	for (int j =i+1; j < arr.length-1; j++) {
		if(arr[i]==arr[j]) {
			count=count+1;
		}
		
	}
	if(count>1) {
		System.out.println(arr[i]);
	}
	}
	}

}
