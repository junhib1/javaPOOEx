public class Estudiante {
    private String name;
    private int age;
    private double score;

    // Constructor
    public Estudiante(String name, int age, double score) {
        setName(name);
        setAge(age);
        setScore(score);
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Edad inválida");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void setScore(double score) {
        if (score < 0) {
            System.out.println("Calificación inválida");
            this.score = 0;
        } else {
            this.score = score;
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    // toString method
    @Override
    public String toString() {
        return "Estudiante{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}