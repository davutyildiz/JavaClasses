
public class Recap {

	public static void main(String[] args) {
	int[] array=new int[6];
	array[0]=33;
	int[] arr= {2,3,5,7};
	
for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}

//for(int i=1; i<=12; i++) {
//	for(int k=1; k<=30; k++) {
//		System.out.println(i+"/ "+k);
//	}
	for(int i:arr) {
		System.out.println(i);}
	
}


	}


