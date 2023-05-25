package com.programs.sorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 34, 12, 56, 77, 83, 90, 22, 18 };
		int len = a.length;

		QuickSort q = new QuickSort();
		q.quickRecursion(a, 0, len - 1);
		q.display(a);
	}

	int partition(int[] a, int low, int high) {
		int temp;
		int pivot = a[(low + high) / 2];

		while (low <= high) {
			while (a[low] < pivot) {
				low++;
			}
			while (a[high] > pivot) {
				high--;
			}
			if (low <= high) {
				temp = a[low];
				a[low] = a[high];
				a[high] = temp;
				low++;
				high--;
			}
		}
		return low;

	}

	void quickRecursion(int[] a, int low, int high) {
		int p = partition(a, low, high);
		if (low < p - 1) {
			quickRecursion(a, low, p - 1);

		}
		if (p < high) {
			quickRecursion(a, p, high);
		}
	}

	void display(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
