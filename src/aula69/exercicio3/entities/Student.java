package aula69.exercicio3.entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade() {
        return (grade1*0.3) + (grade2*0.35) + (grade3*0.35);
    }

    public String passNoPass () {
        if (finalGrade() >= 60) {
            return "PASS";
        } else {
            return "FAILED";
        }
    }

    public double missingPoint() {
        if (finalGrade() < 60) {
            return 60 - finalGrade();
        }
        return 0;
    }

}
