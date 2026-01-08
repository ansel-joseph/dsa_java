import java.util.*;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = sc.nextInt();
        int array[]= new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the value for index " + i + ": ");
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be found: ");
        int x = sc.nextInt();
        
        for(int i=0;i<size;i++){
            if(array[i]==x){
                System.out.println("Element found at index: " + i);
                break;
            }
        }

    }
}