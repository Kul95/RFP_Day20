public class FindMaxNumber {
    public int findMaxNumber(int arr[]){
int max=0;
for(int i=0;i<arr.length;i++){
if(max<arr[i]){
    max=arr[i];
}
    }
return max;
    }

    public int sum(int x,int y){
        return x+y;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int p,int q){
        return p*q;
    }
    public int div(int m,int n){
        return m/n;
    }
}
