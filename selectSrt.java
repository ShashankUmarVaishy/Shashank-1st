import java.util.Scanner;

public class selectSrt {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements to sort: ");
        int count=sc.nextInt();
        int[]term=new int[count];
        for(int i=0;i<count;i++){
        System.out.println("Enter term "+(i+1)+ ":");
        term[i]=sc.nextInt();
        }

            
            for(int i=0;i<count;i++){
                int minidx=i;
                for(int j=i;j<count;j++){
                    if(term[j]<term[minidx]){
                        minidx=j;
                    }
                }
                int temp=term[minidx];
                term[minidx]=term[i];
                term[i]=temp;
            }
            for(int i=0;i<count;i++){
                System.out.print(term[i]+" ");
            }
    }
    
}
