public class EvenOrOdd {
    public static void main(String[] args){
        int num=1;
        if(isOdd(num)){
            System.out.println("the number is odd");
        }
        else{
            System.out.println("the number is even");
        }
    }
    static boolean isOdd(int n){
        return (n & 1)==1;
    }
}
