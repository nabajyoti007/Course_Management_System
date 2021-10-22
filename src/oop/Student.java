package oop;

public class Student{
    String name;
   int id,batch,semester,waiver;

    public void getData(String name,int id,int batch,int semester,int waiver)
    {

        this.name = name;
        this.id = id;
        this.batch = batch;
        this.semester = semester;
        this.waiver = waiver;
    }

    public void display()
    {

        System.out.println("Student's name: "+name);
        System.out.println("student's ID: "+id);
        System.out.println("Batch: "+batch);
        System.out.print("Semester: "+semester);
            if(semester==1){
                System.out.println("st");
            }
            else if(semester==2){
                System.out.println("nd");
            }
            else if(semester==3){
                System.out.println("rd");
            }
            else {
                System.out.println("th");
            }
        System.out.print("Waiver: "+waiver);
        System.out.println("%");
    }

}
