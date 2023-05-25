package Practice;

import java.util.HashSet;

public class RemoveDuplicateElementsInaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a[] = { 1, 2, 2, 3, 3, 3, 4, 4, 5 };
//		int b[] = new int[a.length];
//		int j = 0;
//
//		for (int i = 0; i < a.length - 1; i++) {
//			if (a[i] != a[i + 1]) {
//				b[j] = a[i];
//				j++;
//			}
//		}
//		b[j] = a[a.length - 1];
//
//		for (int i = 0; i < b.length; i++) {
//			if (b[i] != 0) {
//				System.out.println(b[i]);
//			}
//		}

		int a[] = { 2, 2, 7, 8, 2, 1, 7, 8, 9, 2, 4, 3, 3, 1, 2, 6, 5 };
		HashSet<Integer> hs = new HashSet();

		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		for (Integer i : hs) {
			System.out.println(" " + i);
		}

	}

}
