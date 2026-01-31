    import java.util.Scanner;
    public class array{
        public static void main (String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int size= sc.nextInt();

            System.out.println("Enter the elements of the array: ");
            int arr[]= new int[size];
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
            }

            System.out.println("The array elements are: ");
            for(int i=0; i<size; i++){
                System.out.println(arr[i]+" ");
            }

        }
    }