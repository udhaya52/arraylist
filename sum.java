package arrayrecrusion;
import java.util.*;
public class sum {
	public static int sum(int arr[],int i,int sum) {
		if(arr.length==i) {
			return sum;
		}
		sum=sum+arr[i];
		return sum(arr,++i,sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5};
		System.out.println(sum(arr,0,0));

	}

}
