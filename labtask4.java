
public class labtask4 {
    
    String name;

    public labtask4() {
        this.name = "Unknown";
    }

    public labtask4(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        labtask4 student1 = new labtask4();
        System.out.println("Student 1 Name: " + student1.getName());

        labtask4 student2 = new labtask4("purti");
        System.out.println("Student 2 Name: " + student2.getName());

        labtask4 student3 = new labtask4("priya");
        System.out.println("Student 3 Name: " + student3.getName());
    }
}

