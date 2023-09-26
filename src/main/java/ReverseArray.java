public class ReverseArray {
    public int reverseArray(int arr[]){
        int sum=0;
        for (int i=arr.length-1;i>=0;i--){
            sum=sum+arr[i];
        }
        return sum;
    }
}
