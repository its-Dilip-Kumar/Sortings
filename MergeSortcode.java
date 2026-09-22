
import java.util.Arrays;
import java.util.Scanner;

class MergeSortcode{
    public static void mergeSort(int start,int end,int[] arr){
        if(start>=end) return;
        int mid=start+(end-start)/2;
        mergeSort(start,mid,arr);
        mergeSort(mid+1,end,arr);
        merge(start,mid,end,arr);
    }
    public static void merge(int start,int mid,int end,int[] arr){
        int[] temp=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }

        while(j<=end){
            temp[k++]=arr[j++];
        }

        for(int t=0;t<temp.length;t++){
            arr[start+t]=temp[t];
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        mergeSort(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));

    }
}