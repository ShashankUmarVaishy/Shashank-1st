public class quickSrt {
    public static int partition(int [] arr,int low,int high){
        int pivot=arr[high];
        //track no of spaces for elements smaller than pivot 
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;//space for pivot
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;//pivot idx pivIdx
    }
    public static void sort(int [] arr,int low,int high){
        if(low<high){
       //find pivot
       int pivIdx=partition(arr,low,high);
       sort(arr, low, pivIdx-1);
       sort(arr, pivIdx+1, high);
    
       }
    }
    public static void main(String[] args){

        int[] arr={6,3,9,5,2,8,10,11,12,101,-100,-12};
        sort(arr,0,arr.length-1);
        //print sorted one
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
