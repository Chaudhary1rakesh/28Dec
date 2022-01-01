// public class recur_large {
//        public static int largeElement(int arr[]){
//            if(n>arr.length-1)
//            {
//                return 0;
//            }
         
//        }  
//     public static void main(String[] args) {
//         //Write a recursive code for finding the max and min element in the given array arr ={1,-1,0,2,-2,3,-3,4,-4}
// 	//  NOTE: pass arr in every function call.
//         int arr[]={1,-1,0,2,-2,3,-3,4,-4};
        
        
//     }
    
// }

public class recur_large {
	 static int FindMax(int arr[],int n)
	{
		if(n==1)
			return arr[0];
	    return Math.max(arr[n-1], FindMax(arr, n-1));
	}
	 static int FindMin(int arr[],int n)
	{
		 if(n==1)
				return arr[0];
		    return Math.min(arr[n-1], FindMin(arr, n-1));
	}
	public static void main(String[] args) {
		int[] arr={1,-1,0,2,-2,3,-3,4,-4};
        int n=arr.length;
        System.out.println(FindMax(arr,n)+" "+FindMin(arr,n));
	}
}

