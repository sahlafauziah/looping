public class looping4 {
    public static void main(String[] args) {
        for (int x = 0; x<4; x++){
            for(int a=0; a<5; a++){
                if((x+a) % 2 == 0 ){
                    System.out.print("-1 ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
}
