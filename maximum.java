package arrayrecrusion;
import java.util.*;
public class maximum {
	public static int max(int arr[],int i,int max) {
		if(arr.length==i) {
			return max;
		}
		if(arr[i]>max) {
			max=arr[i];
		}
		return max(arr,++i,max);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,21,43,54,12};
		System.out.println(max(arr,0,Integer.MIN_VALUE));

	}

}
