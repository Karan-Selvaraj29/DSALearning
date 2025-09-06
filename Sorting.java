public class Sorting {
    public static void main(String[] args)
    {
        int[] arr={2,1,4,3,6,5,7};
        int size=arr.length-1;
        arr = Sorting.bubbleSort(arr);
        System.out.println("Bubble Sort");
        for(int ans:arr){
            System.out.print(ans+" ");
        }

        System.out.println();

        System.out.println("Selection Sort");
        arr=Sorting.selectionSort(arr,size);
        for(int ans:arr){
            System.out.print(ans+" ");
        }

        System.out.println();
        System.out.println("Insertion sort");
        arr=Sorting.insertionSort(arr,size);
        for(int ans:arr){
            System.out.print(ans+" ");
        }



    }
    // Bubble sorting
    public static int[] bubbleSort(int[] arr)
    {
        int size=arr.length;
        int temp=0;
        for(int i=0;i<size-i-1;i++){

            for(int j=0;j<size-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            size--;
        }
        return arr;

    }

    //Selection Sorting
    public static int[] selectionSort(int[] arr,int size){

        int temp=0;
        for(int i=0;i<size;i++)
        {
            int minimum=i;
            for(int j=i+1;j<size;j++)
            {
                if(arr[minimum]>arr[j]){
                    minimum=j;
                }
            }
            temp=arr[minimum];
            arr[minimum]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }

    //Insertion Sorting
    public static int[] insertionSort(int[] arr,int size)
    {

        for(int i=1;i<size;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

        return arr;
    }
}
