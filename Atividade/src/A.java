public class A {

    private int A1;
    private float A2;


    public int getA1() {
        return A1;
    }
    public void setA1(int a1) {
        A1 = a1;
        //setando o valor de A1
    }

    public float getA2() {
        return A2;
    }
    public void setA2(float a2) {
        A2 = a2;
    }


    public void MA1() {
        System.out.println("MA1");
    }

    public void MA2() {
        System.out.println("MA2");
    }

    public void MA3() {
        System.out.println("Alteração a classe A partir do clone");
    }

    public int getSoma(int n1, int n2) {
        return n1 + n2;
    }
}
