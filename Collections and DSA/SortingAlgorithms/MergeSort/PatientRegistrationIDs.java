import java.util.*;

public class PatientRegistrationIDs {

    static void merge(int arr[], int l, int m, int r){

        int L[]=Arrays.copyOfRange(arr,l,m+1);
        int R[]=Arrays.copyOfRange(arr,m+1,r+1);

        int i=0,j=0,k=l;

        while(i<L.length && j<R.length){

            if(L[i]<=R[j])
                arr[k++]=L[i++];
            else
                arr[k++]=R[j++];
        }

        while(i<L.length)
            arr[k++]=L[i++];

        while(j<R.length)
            arr[k++]=R[j++];
    }

    static void mergeSort(int arr[], int l, int r){

        if(l<r){

            int m=(l+r)/2;

            mergeSort(arr,l,m);

            mergeSort(arr,m+1,r);

            merge(arr,l,m,r);
        }
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        mergeSort(arr,0,n-1);

        for(int x:arr)
            System.out.print(x+" ");
    }
}