package laba3;

public class Study {
    private String course;

    Study ( String course){
        this.course=course;
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study study= new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
    }

}
