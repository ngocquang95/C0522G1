package ss5_static_access_modifier.nested_class;

public class NestedClass {
    private int nonStatic;

    class InnerClass {
        public InnerClass() { // inner class
            System.out.println("Constructor inner class");
        }
    }

    private static boolean isStatic;

    static class StaticNestedClass { // Static Nested Class
        public StaticNestedClass() {
            System.out.println("Constructor Static Nested Class");
        }
    }

    public void main(String[] args) {
        NestedClass nestedClass = new NestedClass();
        nestedClass.nonStatic = 10;

        InnerClass innerClass = nestedClass.new InnerClass();

        isStatic = true;
        StaticNestedClass staticNestedClass = new StaticNestedClass();
    }
}
