package revision;
public class sorting {
	public static void selectionSort(int[] arr, int n)
	{
		for(int i=0; i<=n-2; i++)
		{
			int mini = i;
			for(int j=i; j<=n-1; j++) {
				if(arr[j] < arr[mini]) {
					mini = j;
				}
			}
			
			int temp = arr[mini];
			arr[mini] = arr[i];
			arr[i] = temp;
		}
	}
	public static void bubbleSort(int[] arr, int n) {
		for(int i = n-1; i>=1; i--) {
			for(int j = 0; j<= i-1; j++) {
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void insertionSort(int[] arr, int n) {
		for(int i=0; i<=n-1; i++) {
			int j = i;
			while(j > 0 && arr[j-1] > arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				
				j--;
			}
		}
	}
	public static void main(String args[]) {
		int[] arr = {4,1,3,9,7};
		int n = arr.length;
		insertionSort(arr,n);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
