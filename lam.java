interface FuncInterface {
    public String getname(String name);
}

class lam {
    public static void main(String[] args) {
        FuncInterface c = new FuncInterface() {
            public String getname(String name) {
                return name + " Dharshini";
            }
        };
        System.out.println(c.getname("Divya"));

        System.out.println(new FuncInterface() {
            public String getname(String name) {
                return name + " kumar";
            }
        }.getname("Manoj"));
    }
}