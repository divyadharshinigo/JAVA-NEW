interface FuncInterface2 {
    public String getname(String name);
}

class lam2 {
    static FuncInterface2 c = null;

    public static void main(String[] args) {
        c = lam2::someMethod;
        System.out.println(c.getname("Divya"));

        System.out.println((c = lam2::someFunction).getname("Manoj"));
    }

    static String someMethod(String s) {
        return s + " Dharshini";
    }

    static String someFunction(String s) {
        return s + " Kumar";
    }
}