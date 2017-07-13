interface FuncInterface1 {
    public String getname(String name);
}

class lam1 {
    static FuncInterface1 c = null;

    public static void main(String[] args) {
        c = str -> str + " Darsini";
        System.out.println(c.getname("Divya"));

        System.out.println((c = x -> x + " Kumar").getname("Manoj"));
    }
}