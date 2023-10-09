package ex1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void parabola()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a1=");
        int a=scanner.nextInt();
        System.out.print("b1=");
        int b=scanner.nextInt();
        System.out.print("c1=");
        int c=scanner.nextInt();
        scanner.close();
        int x2,y2;
        x2=-b/(2*a);
        y2=-(b+4*a*c)/4*a;
        System.out.print(x2+ "," + y2);
    }

    public static void main(String[] args) {
       int x, y,x1,y1;
        List<Variabila> Variabile=new ArrayList<Variabila>();
        Variabile.add(new Variabila(1,2,3));
        Variabile.add(new Variabila(3,6,8));
        Variabile.add(new Variabila(6,5,9));

        System.out.println("Lista contine variabilele:");
        for(Variabila p:Variabile) {
            System.out.println(p);
            p.Vf(p);
        }
    parabola();

    }
}
