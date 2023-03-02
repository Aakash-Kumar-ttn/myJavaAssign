import mypackage.myclass;
import mypackage.myclass2;

import java.util.Scanner;
public class Main {
    String color ;
    int age;
    public void eat2(){
        System.out.println("i m eating again");
    }
    public void init(String s , int i){
        color=s;
        age=i;
    }
    void display(){
        System.out.println(color+ " "+ age);
    }
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int a = scn.nextInt();
//        int b = scn.nextInt();


//       System.out.println("Hello world!");
//        Main mn = new Main();
//        mn.eat2();
//        myclass mv = new myclass();
//        mv.eat();
//        mv.run();
//        myclass2 mc = new myclass2();
//        mc.fly();
//       System.out.println(a*b);
        //refrenece variable

//         Main sb = new Main() ;
//         sb.age=10;
//         sb.color="blue";
//        System.out.println(sb.age + " " + sb.color);

        //using method
        Main sb = new Main() ;
        sb.init("black", 78);
        sb.init("blue",89);
        sb.display();
    }
}