/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsprojectnomer4;

/**
 *
 * @author ACER
 */
public class CourseDemo {
        public static void main(String[] args) {
       Instructor myInstructor = new Instructor("Atika", "Shima", "15D");
       
       TextBook myTextBook = new TextBook("Itaewon Class", "Sae Ro Yi", "SMent");
       
       Course myCourse = new Course("Pameran Film", myInstructor, myTextBook);
       
       System.out.println(myCourse);
    }
}
