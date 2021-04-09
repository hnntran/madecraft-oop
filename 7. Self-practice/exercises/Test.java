package exercises;

public class Test {
	public static void main(String[] args) {
		int i = 0;
		int[] array = {1,2,4,5};
		for (; i < array.length; i++) {
            if (array[i] != (i+1)) {
                break;
            }
        }
		System.out.println(i+1);
	}
}
