
class Main{
    public static void main(String a[]){
        Student s1=new Student();
        s1.name="Thiru";
        s1.age=19;
        s1.gender="Male";
        
        Student s2=new Student();
        s2.name="Mathammal";
        s2.age=45;
        s2.gender="Female";
        
        Student s3=new Student();
        s3.name="Maran";
        s3.age=19;
        s3.gender="Male";
        Student student[]=new Student[3];
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;
        System.out.println(student[0]);
        for (int i=0;i<student.length;i++){
            System.out.println(student[i].name +":"+ student[i].age +":"+ student[i].gender);
        }
        System.out.println(s1.name +":"+ s1.age +":"+ s1.gender);
        
    }
}
class Student{
    String name;
    int age;
    String gender;
}
