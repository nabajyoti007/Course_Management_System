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
    public void seventhSemester() {

        String seventhdSem[] = {
                "MGT-3111 Industrial Management                 3",
                "CSE-3111 Numerical Methods                     3",
                "CSE-3112 Numerical Methods Sessional           1",
                "CSE-3115 Computer Networks                     3",
                "CSE-3116 Computer Networks laboratory          1",
                "CSE-3117 Computer Architecture & Design        3"
        };

        System.out.println("\nThe courses available in Seventh Semester are:\n ");
        System.out.println("Course No.      Course Title                Credit");
        for (int i = 0; i < seventhdSem.length; i++) {
            System.out.println(seventhdSem[i]);
        }
    }
    public void eighthSemester() {

        String eighthdSem[] = {
                "EEE-3211 Microprocessor,Assembly Language & Computer Interfacing                    3",
                "EEE-3212 Microprocessor, Assembly Language & Computer Interfacing laboratory        1",
                "CSE-3211 Operating System                                                           2",
                "CSE-3212 Operating System Sessional                                                 1",
                "CSE-3213 Digital Signal Processing                                                  3",
                "CSE-3213 Digital Signal Processing Sessional                                        1"
        };

        System.out.println("\nThe courses available in Eighth Semester are:\n ");
        System.out.println("Course No.              Course Title                                            Credit");
        for (int i = 0; i < eighthdSem.length; i++) {
            System.out.println(eighthdSem[i]);
        }
    }
    public void ninthSemester() {

        String ninthSem[] = {
                "CSE-3315 Compiler Design & Construction                                 3",
                "CSE-3316 Compiler Design & Construction: Sessional                      1",
                "CSE-3317 Java Programming                                               3",
                "CSE-3318 Java Programming: Sessional                                    1",
                "CSE-3319 Software Engineering and Information System Design             3",
                "CSE-3320 Software Engineering and Information System Design Sessional   1",
                "CSE-3300 Project-1                                                      2"
        };

        System.out.println("\nThe courses available in Ninth Semester are:\n ");
        System.out.println("Course No.              Course Title                                  Credit");
        for (int i = 0; i < ninthSem.length; i++) {
            System.out.println(ninthSem[i]);
        }
    }
    public void tenthSemester() {

        String tenthSem[] = {
                "EEE-4127 VLSI I                                    2",
                "EEE-4128 VLSI I Laboratory                         1",
                "CSE-4111 Management Information System             3",
                "CSE-4113 Computer Graphics                         3",
                "CSE-4114 Computer Graphics Sessional               1",
                "CSE-4119 Artifical Intelligence                    3"
        };

        System.out.println("\nThe courses available in Tenth Semester are:\n ");
        System.out.println("Course No.      Course Title                        Credit");
        for (int i = 0; i < tenthSem.length; i++) {
            System.out.println(tenthSem[i]);
        }
    }
    public void eleventhSemester() {

        String eleventhSem[] = {
                "CSE-4211   Web Technologies                          3",
                "CSE-4212   Web Technologies Sessional                1",
                "One course from the list of optional courses         3",
                "CSE-4800   Project/Thesis(Proposal)                  1"
        };

        System.out.println("\nThe courses available in Eleventh Semester are:\n ");
        System.out.println("Course No.    Course Title                       Credit");
        for (int i = 0; i < eleventhSem.length; i++) {
            System.out.println(eleventhSem[i]);
        }
    }
    public void twelfthSemester() {

        String twelfthSem[] = {
                "CSE-4801 Project/Thesis(Finalize & Submission)                                   3",
                "One course from the list of optional courses                                     3"
        };

        System.out.println("\nThe courses available in Twelfth Semester are:\n ");
        System.out.println("Course No.      Course Title                        Credit");
        for (int i = 0; i < twelfthSem.length; i++) {
            System.out.println(twelfthSem[i]);
        }
    }
}
