package algo.binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		int d = 0 ;
	d = binarySearch(new int []{1,2,3,4,5,6}, 3);
	
	System.out.println(d);
	}
	public static int binarySearch (int [] a, int x){
		int p = 0;
		int r = a.length -1;
		while (p <= r){
			int	q = (p+r) / 2;
			if ( a[q] == x) {
				return q;
			} 
			else if ( a[q] > x){
					r = q -1;
					}
			else {
					p = q+1;
				}
		}
		return -1;	
	}
}
