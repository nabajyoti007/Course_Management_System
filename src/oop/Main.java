package oop;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int otherFee=6000;

        Scanner input = new Scanner(System.in);
        Student student = new Student();
        Semester semester = new Semester();

        System.out.println("Enter student name: ");
        student.name = input.nextLine();
        System.out.println("Enter ID: ");
        student.id = input.nextInt();
        System.out.println("Enter batch: ");
        student.batch = input.nextInt();
        System.out.println("Enter semester: ");
        student.semester = input.nextInt();
        System.out.println("Enter waiver: ");
        student.waiver = input.nextInt();

        student.getData(student.name,student.id,student.batch,student.semester,student.waiver);

        student.display();

        if(student.semester==1){

            semester.firstSemester();
            int tFee = 32000;
            int x = student.waiver*tFee;
            int tFeeWithWaiver=(tFee -  (x/100));
            System.out.println("\nTotal Credits : 16");
            System.out.println("Tuition Fees : "+tFeeWithWaiver);
            System.out.println("Other Fees : "+otherFee);
            System.out.println("Total Fees : "+(tFeeWithWaiver+otherFee));

        }
        else if (student.semester==2){

            semester.secondSemester();
            int tFee = 28000;
            int x = student.waiver*tFee;
            int tFeeWithWaiver=(tFee -  (x/100));
            System.out.println("\nTotal Credits : 14");
            System.out.println("Tuition Fees : "+tFeeWithWaiver);
            System.out.println("Other Fees : "+otherFee);
            System.out.println("Total Fees : "+(tFeeWithWaiver+otherFee));

        }
        else if (student.semester==3){

            semester.thiredSemester();
            int tFee = 26000;
            int x = student.waiver*tFee;
            int tFeeWithWaiver=(tFee -  (x/100));
            System.out.println("\nTotal Credits : 13");
            System.out.println("Tuition Fees : "+tFeeWithWaiver);
            System.out.println("Other Fees : "+otherFee);
            System.out.println("Total Fees : "+(tFeeWithWaiver+otherFee));

        }
        else if (student.semester==4){

            semester.forthSemester();
            int tFee = 23000;
            int x = student.waiver*tFee;
            int tFeeWithWaiver=(tFee -  (x/100));
            System.out.println("\nTotal Credits : 11.5");
            System.out.println("Tuition Fees : "+tFeeWithWaiver);
            System.out.println("Other Fees : "+otherFee);
            System.out.println("Total Fees : "+(tFeeWithWaiver+otherFee));

        }
        else if (student.semester==5){

            semester.fifthSemester();
            int tFee = 28000;
            int x = student.waiver*tFee;
            int tFeeWithWaiver=(tFee -  (x/100));
            System.out.println("\nTotal Credits : 14");
            System.out.println("Tuition Fees : "+tFeeWithWaiver);
            System.out.println("Other Fees : "+otherFee);
            System.out.println("Total Fees : "+(tFeeWithWaiver+otherFee));

        }
        else if (student.semester==6){

            semester.sixthSemester();
            int tFee = 29000;
            int x = student.waiver*tFee;
            int tFeeWithWaiver=(tFee -  (x/100));
            System.out.println("\nTotal Credits : 14.5");
            System.out.println("Tuition Fees : "+tFeeWithWaiver);
            System.out.println("Other Fees : "+otherFee);
            System.out.println("Total Fees : "+(tFeeWithWaiver+otherFee));

        }
        else if (student.semester == 7) {

            semester.seventhSemester();
            int tFee = 28000;
            int x = student.waiver * tFee;
            int tFeeWithWaiver = (tFee - (x / 100));
            System.out.println("\nTotal Credits : 14");
            System.out.println("Tuition Fees : " + tFeeWithWaiver);
            System.out.println("Other Fees : " + otherFee);
            System.out.println("Total Fees : " + (tFeeWithWaiver + otherFee));

        }
        else if (student.semester == 8) {

            semester.eighthSemester();
            int tFee = 28000;
            int x = student.waiver * tFee;
            int tFeeWithWaiver = (tFee - (x / 100));
            System.out.println("\nTotal Credits : 14");
            System.out.println("Tuition Fees : " + tFeeWithWaiver);
            System.out.println("Other Fees : " + otherFee);
            System.out.println("Total Fees : " + (tFeeWithWaiver + otherFee));

        }
        else if (student.semester == 9) {

            semester.ninthSemester();
            int tFee = 28000;
            int x = student.waiver * tFee;
            int tFeeWithWaiver = (tFee - (x / 100));
            System.out.println("\nTotal Credits : 14");
            System.out.println("Tuition Fees : " + tFeeWithWaiver);
            System.out.println("Other Fees : " + otherFee);
            System.out.println("Total Fees : " + (tFeeWithWaiver + otherFee));

        }


    }
}
