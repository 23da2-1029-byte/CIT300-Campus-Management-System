/** Student record: ID, Name, Programme, Marks. */
public class Student {
    private final String id;
    private String name, programme;
    private double marks;

    public Student(String id, String name, String programme, double marks) {
        this.id = id; this.name = name; this.programme = programme; this.marks = marks;
    }
    public String getId() { return id; }
    public String getName() { return name; }
    public String getProgramme() { return programme; }
    public double getMarks() { return marks; }
    public void setName(String n) { name = n; }
    public void setProgramme(String p) { programme = p; }
    public void setMarks(double m) { marks = m; }

    @Override
    public String toString() {
        return String.format("ID: %-8s | Name: %-15s | Programme: %-12s | Marks: %.1f", id, name, programme, marks);
    }
}
