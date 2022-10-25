package studiesroom;

public class Student implements Runnable {
    private String name;

    public Student(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    @Override
    public void run(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return name;
    }

}