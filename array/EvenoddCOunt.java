    import java.util.Scanner;
    public class EvenoddCOunt{
        public static void main (String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int size= sc.nextInt();

            System.out.println("Enter the elements of the array: ");
            int arr[]= new int[size];
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
            }
            int evenCount=0;
            int oddCount = 0;

            for(int i=0; i<size; i++){
                if(arr[i]%2==0){
                    evenCount=evenCount+1;
                }else{
                    oddCount=oddCount+1;
                }
            }
            System.out.println("There are "+ evenCount+ " even elements and "+oddCount+" odd elements");
            System.out.println("The array elements are: ");

        }
    }