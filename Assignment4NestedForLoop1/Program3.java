/*WAP to print following pattern
14 14 14 14
15 15 15 15
16 16 16 16
17 17 17 17
 */

class Program3 {
    public static void main(String[] args) {
        int a=14;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(a +" ");
        
            }
            a++;
            System.out.println();
        }
    }
}
