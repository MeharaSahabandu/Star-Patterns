package p5;

// Program to print star pattern (full trangle) 

public class starPatter5 {

    public static void main(String[] args){

        for(int i=0;i<5;i++){

            for (int j=2*4 ; j>0 ;j--) {
                System.out.print(" ");

                if(i>=j){
                    System.out.print("* ");
                }

            }

            System.out.print("\n");

        }
    }
    
}
