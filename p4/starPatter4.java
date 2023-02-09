package p4;

// Program to print star pattern (full trangle) in reverse order

public class starPatter4 {

    public static void main(String [] args){

        for(int i=4;i>0;i--){

            for(int j=4; j>0 ;j--){
                System.out.print(" ");

                if(i>=j){
                    System.out.print("* ");
                }

            }

            System.out.print("\n");
        }
    }
    
}
