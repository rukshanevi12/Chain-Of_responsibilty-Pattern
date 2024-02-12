/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

/**
 *
 * @author User
 */
abstract class Handler {

    Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
    
    public abstract void process(Client client);
}

class Handler1 extends Handler {


    @Override
    public void process(Client client) {
        if (client.i == 0) {
            System.out.println("Number is equal to zero");
        } else {
            System.out.println("Number is not equal to zero");
            this.handler.process(client);
        }
    }
}

class Handler2 extends Handler {


    @Override
    public void process(Client client) {
        if (client.i % 2 == 0) {
            System.out.println("number is divided by 2");
            this.handler.process(client);
        } else {
            System.out.println("number is not divided by 2");
             this.handler.process(client);
        }
    }
}

class Handler3 extends Handler {


    @Override
    public void process(Client client) {
        if (client.i % 5 == 0) {
            System.out.println("number is divided by 5");
        } else {
             System.out.println("number is not divided by 5");
        }
    }

}

class Client {

    int i;
}

public class Test {

    public static void main(String[] args) {
        Client client = new Client();
        client.i = 0; //change the value of this to check if it is diviede by 2,5 or not

        Handler1 handler1 = new Handler1();
        Handler2 handler2 = new Handler2();
        Handler3 handler3 = new Handler3();
        
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);
        
        handler1.process(client);
       
        
    }
}
