class Addition {

    public void add(int num1, int num2) {
        int add = num1 + num2;
        System.out.println("Integer Sum=" + add);
    }

    public void add(float num1, float num2) {
        float add = num1 + num2;
        System.out.println("float Sum=" + add);
    }

    public void add(int num1, float num2) {
        float add = num1 + num2;
        System.out.println("Integerfloat Sum=" + add);
    }

    public void add(float num1, int num2) {
        float add = num1 + num2;
        System.out.println("floatInteger Sum=" + add);
    }

    public void add(int num1, int num2, int num3) {
        int add = num1 + num2 + num3;
        System.out.println("3Integer Sum=" + add);
    }

    public static void main(String args[]) {
        Addition s = new Addition();
        s.add(56.3f, 89.6f);
    }
}