public class natural_num_r {
    public static void main(String[] args)
{
    int number=10, Count,num,n ;
    
    static int natural_num(int num){
        if(num<1){
            return 0;
        }
        return natural_num((((num+1) num )/2));

    }

    System.out.println(natural_num(15));
        
    }
    
}
