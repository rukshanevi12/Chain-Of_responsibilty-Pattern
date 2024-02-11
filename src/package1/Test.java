/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

/**
 *
 * @author User
 */
class A {
    
    X x;
    B b;
    
    public A(X x) {
        this.x = x;
        b = new B(x);
    }
    
  
    
    public void p() {
           if (x.i == 0) {
            System.out.println("Error-a");
        } else {
            System.out.println("Success-a");
            b.p();
        }
    }
}

class B {
    
    X x;
    C c;
    
    public B(X x) {
        this.x = x;
        c =  new C(x);
    }
    
    public void p() {
        if (x.i%5 == 0) {
            System.out.println("Error-b");
        } else {
            System.out.println("Success-b");
            c.r();
        }
    }
}

class C {
    
    X x;
    
    public C(X x) {
        this.x = x;
    }
    
    public void r() {
         if (x.i%2 == 0) {
            System.out.println("Error-c");
        } else {
            System.out.println("Success-c");
        }
    }
}

class X {
    
    int i;
}

public class Test {
    
    public static void main(String[] args) {
        X x = new X();
        x.i = 4;
        
        A a = new A(x);
        a.p();
    }
}
