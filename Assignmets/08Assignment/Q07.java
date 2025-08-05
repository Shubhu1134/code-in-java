class Student {
    private String name;
    private int mathMarks;
    private int scienceMarks;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    // Method to calculate average
    public double getAverage() {
        return (mathMarks + scienceMarks) / 2.0;
    }

    // Method to display student result
    public void showResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Math Marks: " + mathMarks);
        System.out.println("Science Marks: " + scienceMarks);
        System.out.println("Average Marks: " + getAverage());
    }
}

public class Test {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Priya Verma");
        obj.setMathMarks(85);
        obj.setScienceMarks(90);

        obj.showResult();
    }
}