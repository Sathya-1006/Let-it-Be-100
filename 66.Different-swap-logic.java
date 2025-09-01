

class Main {
    public static void main(String[] args) {
        int a=1000;
        int b=200;
        System.out.println("Values before swap: a= "+a+" b= "+b);
        
        //Logic-1 Using temp
       
        int temp=a;
        a=b;
        b=temp;
        
        
        //Logic-2 Using + - operators(without temp)
       /*
        a=a+b;
        b=a-b;
        a=a-b;
        */
        
        //Logic -3 using * / => a,b should be non-zero.(without temp)
       /*
        a=a*b;
        b=a/b;
        a=a/b;
        
        */
        
        //Logic-4 using XOR(^)
        /*
        a=a^b;
        b=a^b;
        a=a^b;
        */
        
        //Logic-5 Single line 
       // b=a+b - (a=b);
        //this runs right to left
        
        
        System.out.println("Values after swap: a= "+a+" b= "+b);
    }
}
