package pro1010;

//foreachµü´úÊý×é
public class DemoB {
	public static void main(String[] args) {
		/*int[] arr={9,98,99,96};
		for (int i : arr) {
			System.out.println(i);
		}*/
		int arr={11,16,102,228,356,21};
		for(int j=0;j<arr.length-1;j++){
		for(int i=0;i<arr.length-1-j;i++){
			if(arr[i]>arr[i+1]){
				int m=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=m;
			}
		}}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
	}

}
