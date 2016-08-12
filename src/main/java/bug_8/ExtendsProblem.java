package bug_8;

public class ExtendsProblem {
    public static void main(String[] args) {
        new D();
    }

}


class A {
    public A() {
        new Object();
    }
}


class B extends A {
    public B() {
        new A();
    }
}


class C extends B {
    public C() {
        new D();
    }
}

class D extends C {
    public D() {
       new C();
    }


    /**заменил
     * class C extends B { public C() { new D(); }} (здесь была рекурсия, так как использовалась одновременно композиция и
     * наследование, а классы друг друга наследовать не могут)
     * на class C extends B { public C() { new B(); }}
     */
}