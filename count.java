public class count {
 
    public static void main(String[] args) {
        
        int num = 23457;
         
        //variable to store count of digits in number
        int count = 0;
         

        while(num!=0) {
            num = num/10; //removes last digit of num
            count++;
        }
         

        System.out.println(count);
    }
}