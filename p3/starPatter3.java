package p3;

// Program to print star pattern (right angle triangle) in reverse order

public class starPatter3 {

    public static void main(String[] args){

        for(int i=5; i>0;i--){

            for (int j=0; j<i;j++){
                System.out.print("* ");
            }

            System.out.print("\n");
        }
    }
    
}
