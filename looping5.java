public class looping5 {
    public static void main(String[] args) {
        for (int i = 0; i<= 3; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
            
            for (int j = 0; j < i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
