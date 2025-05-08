package arraylist;
import java.util.*;
public class removesame {

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
				
		ArrayList list=new ArrayList();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
//		while(true) {
//			int n=sc.nextInt();
//			if(n==-1) {
//				break;
//			}list.add(n);
//		}
		ArrayList<Integer> list1=new ArrayList<Integer>(new LinkedHashSet<Integer>(list));
//		System.out.println(list.toString());
//		for(int i=1;i<list.size();i++) {
//			if(list.get(i)==list.get(i-1)) {
//				list.remove(i);
//			}
//		}
		System.out.println(list1.toString().replace("[", "").replace("]", ""));
		

	}

}
