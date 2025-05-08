package arraylist;
import java.util.*;
public class reverse {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(29);
		list.add(15);
		list.add(51);
		list.add(45);
		//Collections.sort(list);
		//int st=0,t=0;
		//int end=list.size()-1;
//		while(st<end) {
//			t=list.get(st);
//			list.set(st, list.get(end));
//			list.set(end,t);
//			st++;
//			end--;
//		//Collections.swap(list, 0, 0);
//		}
		//Collections.swap(list, st++, end--);
		Collections.reverse(list);
		System.out.println(list.toString().replace("[", "").replace("]", ""));
		System.out.println();
	}

}