import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    @Autowired
    static Car car;

    public static void main(String[] args) throws InterruptedException {


        //first task: context class
        System.out.println(Person.name);



        //second task: special class
        System.out.println(car.model);

        TestClass i1 = TestClass.getInstance();
        TestClass i2 = TestClass.getInstance();

        System.out.println(i1==i2);




        //third task

        List<Thread> threads = new ArrayList<Thread>();

        Runnable task = () -> {
            try {
                Printer.print();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        for (int i=0; i<3; i++){
            Thread thread = new Thread(task);
            thread.setName("Thread"+i);
            threads.add(thread);
            thread.start();
        }
    }
}