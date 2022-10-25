/**
 * Main file of the project.
 */
package studiesroom;

import java.util.concurrent.Semaphore;

/**
 * @author Korn, Andreas
 */
public class StudiesRoom{

    static final int MAX_STUDENTS = 10;
    static final int NUM_OF_STUDENTS = 5;

    public static int studentsInRoom = 0;

    public static Semaphore directorCanEnter = new Semaphore(1);
    public static Semaphore studentsCanEnter = new Semaphore(NUM_OF_STUDENTS);

    // Possible student names list 
    static final String[] STUDENT_NAMES = {
        "Andrés",
        "Marc",
        "Alberto",
        "Iván",
        "Juan",
        "Miguel",
        "Álex",
        "Javier",
        "Francisco",
        "David"
    };

    public static void main(String[] args){
        // We create the array that manages the students.
        Student[] studentsList = new Student[NUM_OF_STUDENTS];

        for(int i = 0; i < NUM_OF_STUDENTS; i++){
            studentsList[i] = new Student(getName(i));
            studentsList[i].run();
        }

        Director director = new Director();
        director.run();
    }

    /**
     * @param i - The number of the student to generate
     * @return The student's name if it's written in the array, or a general name if not.
     */
    private static String getName(int i){
        try {
            return STUDENT_NAMES[i];
        } catch(IndexOutOfBoundsException oob){
            return "Student-" + i;
        }
    }
}