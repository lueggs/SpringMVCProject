package main.java.jackey;

public class test {

	public static void main(String[] args){
//		char[] array = { 'A', 'B', 'C', 'D' };
//		sort(array, 0, array.length);
		
		
//		for (int i = 1; i <= 5 ; i++) {
//			for (int j = 5; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		String s1 = "a,b,c,d,e,f,g";
		String s2 = "";
		String[] split = s1.split(",");
		for (int i = 0; i < split.length; i++) {
			s2=split[i]+"1"+"、";
			System.out.print(s2);
		}
	}

//	private static void sort(char[] array, int start, int length) {
//		if (start == length - 1) {
//			for (int i = 0; i < length; i++) {
//				System.out.print(array[i]);
//			}
//			System.out.println("");
//		} else {
//			for (int i = start; i < length; i++) {
//				change(array, i, start);
//				sort(array, start + 1, length);
//				change(array, i, start);
//			}
//		}
//	}
//
//	public static void change(char[] array, int a, int b) {
//		char origin = array[a];
//		array[a] = array[b];
//		array[b] = origin;
//	}

}
