import java.util.*;
public class Ejercicio13{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String op="45";

        while (op!="c" && op!="C"){
            System.out.println("a. sumar");
            System.out.println("b. dividir");
            System.out.println("c. salir");
            op=scanner.next();
            if (op=="a" && op=="A"){
                System.out.println("Ingrese dos numeros");
                float n1=scanner.nextInt();
                float n2=scanner.nextInt();
                float s=n1+n2;
                System.out.println("la suma es: "+s);
            }
            if (op=="b" && op=="B"){
                System.out.print("el numero ");
                float n1=scanner.nextInt();
                System.out.print("dividido entre ");
                float n2=scanner.nextInt();
                if (n2==0){
                    System.out.print("no se puee dividir por cero");
                }else{
                    float div=n1/n2;
                    System.out.print("la division es: "+div);
                }
            }
            
        }
    } 

}