package pamoka.pirma;

public class Student extends Person {

    private String program;
    private int year;
    private float fee;

    public Student(String name, String address,
                   String program, int year, float fee) {
        super(name, address);

        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return this.program;
    }

    public int getYear() {
        return this.year;
    }

    public float getFee() {
        return this.fee;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(float fee) {
        if(fee > 0)
            this.fee = fee;
    }

    @Override
    public String toString() {
        return super.toString() + ", program = " + program;
    }
}
