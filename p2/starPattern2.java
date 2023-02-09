package p2;

// Program to print star pattern (right angle triangle)

public class starPattern2 {

    public static void main(String[] args){

        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    
}
