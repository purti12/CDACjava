
public class Question6{
    public static void main(String[] args) {
        PublicAccessExample example = new PublicAccessExample();
        
        // Access public members
        example.publicField = "This is a public field";
        example.publicMethod();
        
        // Access protected members (from the same package)
        example.protectedField = "This is a protected field";
        example.protectedMethod();
        
        // Access default members (from the same package)
        example.defaultField = "This is a default field";
        example.defaultMethod();
        
        // Access private members (within the same class)
        example.accessPrivateMembers();
    }
}

// PublicAccessExample.java
class PublicAccessExample {
    public String publicField;
    protected String protectedField;
    String defaultField; // Default access (package-private)
    private String privateField;

    public void publicMethod() {
        System.out.println("This is a public method");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    void defaultMethod() {
        System.out.println("This is a default method");
    }

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    public void accessPrivateMembers() {
        privateField = "This is a private field (accessed within the same class)";
        privateMethod();
    }
}

