//Daniel Zabari
//APCS2 09
//HW41
//2014-05-20
/**********************************************
 Runtime is O(nlog(n))
 Adding is logn and removing is logn and each mustbe done n times thats 2(nlogn) which simplifies to nlogn.
 Worst case scenario is reverse order, still nlogn.  best is in order, which ia O(n).

 **********************************************/
import java.util.*;
public class Heapsort{


    public static Integer[] sort(Integer[] data){
	ALHeap _heap=new ALHeap();
	Integer[] ret=new Integer[data.length];
	for (Integer i:data)
	    _heap.add(i);
	for (int i=0;i<ret.length;i++)
	    ret[i]=_heap.removeMin();
	return ret;
    }

    public static void main(String[] args){
	Integer[] try1=new Integer[20];
	for (int i=0;i<try1.length;i++)
	    try1[i]=((int)(Math.random()*100));
	System.out.println(Arrays.toString(try1));
	System.out.println(Arrays.toString(sort(try1)));
	
    }
}
