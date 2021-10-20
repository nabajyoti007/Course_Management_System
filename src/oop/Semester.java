package oop;

public class Semester extends Student{

    public void firstSemester() {

        String firstSem[] = {
                "ENG-1111 English Reading and Speaking           3",
                "ART-1111 Bangladesh Studies                     3",
                "MAT-1111 Differential and Integral Calcullus    3",
                "CSE-1111 Introduction to Computers              2",
                "CSE-1112 Introduction to Computers Sessional    1",
                "EEE-1111 Electrical Circuits I                  3",
                "EEE-1112 Electrical Circuits I Sessional        1"
        };

        System.out.println("\nThe courses available in First Semester are:\n ");
        System.out.println("Course No.      Course Title                  Credit");
        for (int i = 0; i < firstSem.length; i++) {
            System.out.println(firstSem[i]);

        }

    }
    public void secondSemester() {

        String secondSem[] = {
                "MAT-1213 Linear Algebra and Complex Analysis     3",
                "CSE-1213 Computer Programming                    3",
                "CSE-1214 Computer Programming Sessional          1",
                "CSE-1215 Discrete Mathmatics                     3",
                "EEE-1215 Electronics                             3",
                "EEE-1216 Electronics Sessional                   1"
        };

        System.out.println("\nThe courses available in Second Semester are:\n ");
        System.out.println("Course No.      Course Title                   Credit");
        for (int i = 0; i < secondSem.length; i++) {
            System.out.println(secondSem[i]);
        }
    }
    public void thiredSemester() {

        String thiredSem[] = {
                "ENG-1311 English Writing & Listening                   3",
                "ART-1311 Introduction to Sociology                     3",
                "MAT-1315 Differential Equations and Fourier Analysis   3",
                "CSE-1315 Data Structures                               3",
                "CSE-1316 Data Structures Sessional                     1"
        };

        System.out.println("\nThe courses available in Thired Semester are:\n ");
        System.out.println("Course No.      Course Title                        Credit");
        for (int i = 0; i < thiredSem.length; i++) {
            System.out.println(thiredSem[i]);
        }
    }

    public void forthSemester() {

        String forthSem[] = {
                "ACC-2111 Principles of Accounting                      3",
                "CEE-2110 Engineering Drawing                           3",
                "MAT-2111 Co-ordinate geometry and Vector Analysis      3",
                "CSE-2117 Computer Algorithms and Complexity            3",
                "CSE-1316 Computer Algorithms and Complexity Sessional  1"
        };

        System.out.println("\nThe courses available in Forth Semester are:\n ");
        System.out.println("Course No.      Course Title                        Credit");
        for (int i = 0; i < forthSem.length; i++) {
            System.out.println(forthSem[i]);
        }
    }

    public void fifthSemester() {

        String fifthSem[] = {
                "ECO-2211 Principles of Economics                   3",
                "MAT-2213 Probability and Statistics                3",
                "PHY-2211 General Physics                           3",
                "PHY-2212 General Physics Laboratory                1",
                "CSE-2213 Object Oriented Programming               3",
                "CSE-2214 Object Oriented Programming Sessional              1"
        };

        System.out.println("\nThe courses available in Fifth Semester are:\n ");
        System.out.println("Course No.      Course Title                        Credit");
        for (int i = 0; i < fifthSem.length; i++) {
            System.out.println(fifthSem[i]);
        }
    }
    public void sixthSemester() {

        String sixthSem[] = {
                "CHE-2311 Chemistry                                 2",
                "CHE-2312 Chemistry Laboratory                       1",
                "EEE-2317 Digital Electronics                       3",
                "EEE-2318 Digital Electronics Laboratory          1.5",
                "CSE-2319 Database Management System                3",
                "CSE-2320 Database Management System Sessional      1",
                "CSE-2321 Data Communication                        3"
        };

        System.out.println("\nThe courses available in Sixth Semester are:\n ");
        System.out.println("Course No.      Course Title                        Credit");
        for (int i = 0; i < sixthSem.length; i++) {
            System.out.println(sixthSem[i]);
        }

    }

}
