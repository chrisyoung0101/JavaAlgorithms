package basics;

public class MinMeanMaxMyWay {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("min : " + min(arr));
		
		System.out.println("mean : " + mean(arr));

		System.out.println("max : " + max(arr));
	}
	
	//int[] arr = {8, 2, 3, 4, 5, 6, 7, 1, 9, 10};
	
	static int min(int[] arr) {
		
		int minNum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < arr[i + 1]) {
				minNum = arr[i];
				return minNum;
			}
		}
		return minNum;
	}
	
	static int mean(int[] arr) {
		//mean is the average of all numbers
		
		int num = 0;
		
		for(int i = 0; i < arr.length; i++) {
			num = num + arr[i];
		}
		
		int mean = (num/arr.length);
		
		return mean;
	}

	static int max(int[] arr) {
	
		int maxNum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}
		
	}


