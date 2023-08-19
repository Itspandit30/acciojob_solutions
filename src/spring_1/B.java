public class B extends A {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.meth());
    }

    @Override
    public String meth() {
        return "Method is overridden in Extendend class B";
    }
}
