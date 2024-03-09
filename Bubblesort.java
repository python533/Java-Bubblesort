import java.util.Arrays;

public class Main{
public Static Void Main{
static void bublesort(int array[]){
int size= array.length;
for(i=0;i<size -1;i++)
for(j=0;j<size -i -1;j++)
if (array[j] > array[j+1]) {
int temp= array[j];
array[j+1]=array[j+1];
array[j+1]=temp;

}

}

public static void main(String args[]){
  int[] data = { -2, 45, 0, 11, -9 };
  Main.bublesort(data);
  System.out.println("Dizinizi bublesort sıralamasına göre Yazdırın");
  System.out.println(Arrays.toString(data));
}

}
