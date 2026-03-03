class Main{
    public static void main(String a[])
{
    int arr1[]={1,2,3,4};
    int arr2[]= new int[4];
    arr2[0]=1;
    arr2[1]=2;
    System.out.println(arr1[1]);
    System.out.println(arr2[2]);
    System.out.println("This is the after the element traversed by using for loop");
    
    //accesing the element in the array 
    for (int i=0;i<4;i++){
        System.out.println(arr1[i]);
    }
    
}
}
