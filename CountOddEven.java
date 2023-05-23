public class CountOddEven {
    public static void main(String[]Args) {
     int num=3456789,evencount=0,oddcount=0;
     while(num>0)
     {
        if(num%2==0){
            evencount++;
        }
        else{
            oddcount++;
        }
        num/=10;
     } 
System.out.println("even count: "+evencount);
System.out.println("even count: "+oddcount);
    }
}
