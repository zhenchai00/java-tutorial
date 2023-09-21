
package labtutorial.Week2Lab;

public class exe8 {
	public static void main (String[] args) {
		int[] x = new int[100];
		
        for(int i = 0; i < x.length; i++){
            x[i] = (i + 10) * 10;   //100, 110, 120, 130, to 1090
        }
        for(int a : x){
            System.out.println(a);
        }
	}
}
