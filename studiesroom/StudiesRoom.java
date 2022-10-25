/**
 * Main file of the project.
 */
package studiesroom;

/**
 * @author Korn, Andreas
 */
public class StudiesRoom{

    static final int MAX_STUDENTS = 10;
    static final int NUM_OF_STUDENTS = 15;

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

    private static String getName(int i){
        try {
            return STUDENT_NAMES[i];
        } catch(IndexOutOfBoundsException oob){
            return "Student-" + i;
        }
    }

    public static void main(String[] args){
        // We create the array that manages the students.
        Student[] studentsList = new Student[NUM_OF_STUDENTS];

        for(int i = 0; i < NUM_OF_STUDENTS; i++){
            studentsList[i] = new Student(getName(i));
            studentsList[i].run();
        }
    }
}