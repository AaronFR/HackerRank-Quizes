package Quizes;


import static Quizes.quizAnswers.memoryManagementAnwser1;

import java.util.Vector;

public class MemoryManagement {

    public static void main(String[] args) {
        System.out.println("When is this code subject to garbage collection?");

        Vector v1 = new Vector();
        Vector v2 = new Vector();
        v1.addElement("123");
        v1.addElement(v2);
        String s = (String) v1.elementAt(0);
        v1 = v2;
        v2 = v1;
        v1.addElement(s);

        System.out.println("\t" + memoryManagementAnwser1);
    }
}
