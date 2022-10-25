package studiesroom;

import java.util.Random;

public class Student implements Runnable {
    
    private static Random r = new Random();
    private static final int MAX_STUDY_TIME = 1000;

    private String name;
    private int studyingTime;

    public Student(String name){
        this.name = name;
        studyingTime = r.nextInt(MAX_STUDY_TIME);
    }

    private void enterRoom(){
        StudiesRoom.studentsInRoom++;
        System.out.println(name + " enters the study room. Students: " + StudiesRoom.studentsInRoom);
    }

    @Override
    public void run() {
        try {
            StudiesRoom.studentsCanEnter.acquire();
            enterRoom();
            while(studyingTime > 0){
                if(StudiesRoom.studentsInRoom < StudiesRoom.MAX_STUDENTS){
                    studyingTime--;
                } else {
                    // TODO party logic
                    System.out.println("IT'S PARTY TIME!!!!");
                }
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }

    @Override
    public String toString(){
        return name;
    }

}