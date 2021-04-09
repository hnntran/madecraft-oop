package exercises;

import java.util.*;
import java.lang.Integer;

public class MergeSort 
{
    public static void main(String[] args) 
    {
        //Unsorted array
        Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        System.out.println("Unsorted list: " + Arrays.toString(list));
         
        //Call merge sort
        mergeSort(list);
         
        //Check the output which is sorted array
        System.out.print("Sorted list: ");
        for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
        
        System.out.println();
        
        Circle[] list1 = {new Circle(2), new Circle(3), new Circle(2),

                new Circle(5), new Circle(6), new Circle(1), new Circle(2),

                new Circle(3), new Circle(14), new Circle(12)};
        
        System.out.println("Unsorted list: " + Arrays.toString(list1));

        mergeSort(list1);

		for (int i = 0; i < list1.length; i++) {
			System.out.print(list1[i] + " ");
			}

    }
 
    @SuppressWarnings("rawtypes") 
    public static Comparable[] mergeSort(Comparable[] list) 
    {
        //If list is empty; no need to do anything
        if (list.length <= 1) {
            return list;
        }
         
        //Split the array in half in two parts
        Comparable[] first = new Comparable[list.length / 2];
        Comparable[] second = new Comparable[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);
         
        //Sort each half recursively
        mergeSort(first);
        mergeSort(second);
         
        //Merge both halves together, overwriting to original array
        mergeSort(first, second, list);
        return list;
    }
     
    @SuppressWarnings({ "rawtypes", "unchecked" }) 
    private static void mergeSort(Comparable[] first, Comparable[] second, Comparable[] result) 
    {
        //Index Position in first array - starting with first element
        int iFirst = 0;
         
        //Index Position in second array - starting with first element
        int iSecond = 0;
         
        //Index Position in merged array - starting with first position
        int iMerged = 0;
         
        //Compare elements at iFirst and iSecond, 
        //and move smaller element at iMerged
        while (iFirst < first.length && iSecond < second.length) 
        {
            if (first[iFirst].compareTo(second[iSecond]) < 0) 
            {
                result[iMerged] = first[iFirst];
                iFirst++;
            } 
            else
            {
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }
        //copy remaining elements from both halves - each half will have already sorted elements
        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
    }
}

class Circle implements Comparable< Circle > {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	/** Return radius */
	public int getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public int compareTo(Circle o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.radius, o.getRadius());
	}
}