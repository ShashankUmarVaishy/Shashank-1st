import java.util.Scanner;

public class bubblesrt {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements to sort: ");
        int count=sc.nextInt();
        int[]term=new int[count];
        for(int i=0;i<count;i++){
        System.out.println("Enter term "+(i+1)+ ":");
        term[i]=sc.nextInt();
        }
        for(int j=0;j<count-1;j++){
        for(int i=0;i<count-1-j;i++){
            if(term[i]>term[i+1]){
                int temp=term[i];
                term[i]=term[i+1];
                term[i+1]=temp;
                }
            }
        }
        for(int i=0;i<count;i++){
            System.out.println(term[i]+"    ");
        }
    }
}
