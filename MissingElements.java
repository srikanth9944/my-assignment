package assginment3;

import java.util.Arrays;

public class MissingElements {
	public static void main(String[] args) {
		int[] arr= {1,2,4,5,6,7,9};
		Arrays.sort(arr);
		int arrlen=arr.length;
		System.out.println(arrlen);
		for (int i = 0; i < arr.length; i++) {
			int arr1=i+1;{
				if(arr1!=arr[i]) {
					System.out.println(arr1);
				}
				break;
			}
			
		}
	}

}
