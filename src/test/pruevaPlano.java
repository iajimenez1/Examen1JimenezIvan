
package test;

import dominio.Plano;
import java.util.Scanner;
public class pruevaPlano {

    public static void main(String[] args) {
       
        Plano P;
        Scanner u = new Scanner(System.in);
        int o,b=0; 
        P= new Plano();
        System.out.println("El punto de inicio es 0;0");
        System.out.print("Ingrese el numero de veces que va a realizar los movimientos:");
        o = u.nextInt();
        do{
            if(o<1){
                System.out.println("Los numero deben ser positivos;");
                    System.out.println("Ingrese otro numero:");
                    o = u.nextInt();
            }else{
                b=1;
            }
        }while(b!=1);
        movimiento(P,o);         
    }
    
    public static void movimiento (Plano P, int l){
        int x, y, a, r = 0, m, n = 0;
        double k;
        Scanner o = new Scanner(System.in);
        do{       
        System.out.println("Ingrese el numero de esapcios que desea mover:");
            m= o.nextInt();
            do {
                a = 0;
                if (m<0) {
                    System.out.println("Los numero ingresados deben ser positivos:");
                    System.out.println("Ingrese un numero valido numero:");
                    m= o.nextInt();
                } else {
                    a = 1;
                }
            } while (a != 1);
            n=n+m;
            k= Math.random() * 4 + 1;
            if (k>2) {
                if (k<3) {
                    y = P.getY()+m;
                    P.setY(y);
                    System.out.println("El punto se encuentra en la posicion: "+P.verifica());
                    System.out.print("El punto se ha movido: " + m + " hacia arriba.");
                }
            }
             if (k>4) {
                if (k<5) {
                    y = P.getY()-m;
                    P.setY(y);
                    System.out.println("El punto se encuentra en la posicion: "+P.verifica());
                    System.out.print("El punto se ha movido: " + m + " hacia abajo.");
                }
            }
             if (k>3) {
                if (k<4) {
                    x = P.getX()-m;
                    P.setX(x);
                    System.out.println("El punto se encuentra en la posicion: "+P.verifica());
                    System.out.print("El punto se ha movido: " + m + "hacia la izquierda.");

                }
            }
            if (k>1) {
                if (k<2) {
                    x = P.getX()+m;
                    P.setX(x);
                    System.out.println("El punto se encuentra en la posicion: "+P.verifica());
                    System.out.println("El punto se ha movido: " +m+ " hacia la derecha.");
                }
            }
            r++;
    }while(a!=l);
        System.out.println("La distancia total que se ha movido es:");
        System.out.println(n);
   }
  }
        
        
        
        
        
        
        