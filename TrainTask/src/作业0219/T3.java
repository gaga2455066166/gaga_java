package ื๗าต0219;

public class T3 {

	public static void main(String[] args) {
	    Integer[] array = {1, 2, 3, 4, 5};
	    swapInArray(array, 1, 3);
	    for (Integer integer : array) {
	        System.out.print(integer + " ");
	    }
	    System.out.println();
	    swapInArray(array, 1, 8);
	    for (Integer integer : array) {
	        System.out.print(integer + " ");
	    }
	    System.out.println();
	    reverse(array);
	    for (Integer integer : array) {
	        System.out.print(integer + " ");
	    }
	    System.out.println();
	}

	private static <T> void swapInArray(T[] array, int location1, int location2) {
	    try {
	        T temp = array[location1];
	        array[location1] = array[location2];
	        array[location2] = temp;
	    } catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println(e.getMessage());
	    }
	}
	private static <T> void reverse(T[] array) {
	    int length = array.length;
	    for (int i = 0; i < length / 2; i++) {
	        T temp = array[i];
	        array[i] = array[length - 1 - i];
	        array[length - 1 - i] = temp;
	    }
	}

}
