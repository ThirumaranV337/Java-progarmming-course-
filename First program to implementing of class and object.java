class Main{
    public static void main(String[] args)
    {
        calculator calc= new calculator();//the object for the class is created 
        int result=calc.test();//method calling 
        System.out.println(result);
    }
}//The above block was my main this is going to call the object
class calculator{
    public int test()
    {
        System.out.println("The object is visited");
        return 0;
        
    }
}//This was my callable object 
