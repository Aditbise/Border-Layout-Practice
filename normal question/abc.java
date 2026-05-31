// import java.util.*;

class abc {
    int a, b, c;
    
    void input() {
        a = 10;
        b = 45;
    }
    
    abc sum(abc x) {
        abc y = new abc();
        y.a = x.a;
        y.b = x.b;
        y.c = a + b;
        return y;
    }
    
    public static void main(String args[]) {
        abc ob1 = new abc();
        ob1.input();
        abc ob2 = ob1.sum(ob1);
        System.out.println(ob2.c);
    }
}
