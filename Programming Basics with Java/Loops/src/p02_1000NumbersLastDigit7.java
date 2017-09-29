public class p02_1000NumbersLastDigit7 {
    public static void main(String[] args) {
        for(int i = 0 ; i <= 1000; i++ ){
            if(i % 10 == 7){
                System.out.println(i);
            }
        }
    }
}
