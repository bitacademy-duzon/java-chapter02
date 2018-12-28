package chapter02;

public class ArrayUtil {
	// int 배열을 double 배열로 변환
	public static double[] intToDouble( int[] source ) {
		double[] result = new double[source.length];
		
		for(int i = 0; i < source.length; i++) {
			result[i] = source[i];
		}
		
		return result;
	}
	
	// double 배열을 int 배열로 변환
	public static int[] doubleToInt( double[] source ) {
		int[] result = new int[source.length];
		
		for(int i = 0; i < source.length; i++) {
			result[i] = (int)source[i];
		}
		
		return result;
	}
	
	// int 배열 두 개를 연결한 새로운 배열 리턴
	public static int[] concat( int[] s1, int[] s2 ) {
		int[] result = new int[s1.length + s2.length];
		
		int index = 0;
		
		for(int val : s1) {
			result[index++] = val;
		}

		for(int val : s2) {
			result[index++] = val;
		}
		
		return result;
	}

}
