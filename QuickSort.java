

public class QuickSort {
public static void quickSort(int A[],int left,int right)
{
int q;
if(right > left)
{
q = partition(A,left,right);
quickSort(A,left,q-1);
quickSort(A,q+1,right);
}
}

static int partition(int A[], int left,int right)
{
int p = A[left];
int i = left;
int j = right+1;
for(; ;)
{
while(A[++i] <p){
if (i>=right){
break;
}
}
while(A[--j] >p){
if(j<=left){
break;
}
}
if (i>=j){
break;
}
else{

int temp;
temp = A[i];
A[i ]= A[j];
A[j] = temp;
}
}
if(j ==left){
return j;
}

int temp;
temp = A[left];
A[left]= A[j];
A[j] = temp;
return j;
}



public static  void main(String[] args){
int[] arr= {34,56,32,12,78,36,90,6};


quickSort(arr, 0 ,7);
for (int x = 0; x < 8; x++) {
System.out.print( arr[x]+ " ");     
}  

}
}
