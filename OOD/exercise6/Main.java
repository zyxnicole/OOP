package exercise6;

/**
 * Program: INFO5100
 * Description:
 * CreatedBy: Nicole_Z
 * CreatDate: 11/21/2020
 **/

public class Main {
    public static void main(String[] args) throws Exception {

            PersonAsym Alice = new PersonAsym("Alice");
            PersonAsym Bob = new PersonAsym("Bob");
            String msg = "Hello world";
            Alice.sendMsg(msg, Bob);
            System.out.println(Bob.readMsg());

//            PersonSym Alice = new PersonSym("Alice");
//            PersonSym Bob = new PersonSym("Bob");
//            String msg = "Hello Bob";
//            Alice.setMsg(msg, Bob);
//            System.out.println(Bob.readMsg());
    }
}
