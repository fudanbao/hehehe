package text;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		int[] a = new int[99];
		for (int i = 0; i < a.length; i++) {
			a[i]=i+1;
		}
		int[] arr = new int[99];
		boolean[] index = new boolean[99];
		for (int i = 0; i < arr.length; i++) {
			int j;
			do{
				j=new Random().nextInt(99);
			}while(index[j]=true);
			arr[i]=a[j];
			index[j]=true;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("aas");
	}

}
