package studiesroom;

public class Student implements Runnable {
    private String name;

    public Student(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    private void enterRoom(){
        StudiesRoom.studentsInRoom++;
        System.out.println(name + " enters the study room. Students: " + StudiesRoom.studentsInRoom);
    }

    @Override
    public void run(){
        enterRoom();
    }

    @Override
    public String toString(){
        return name;
    }

}