package javaapplication17;

public class JavaApplication17 
{
 
    public static void main(String[] args)
    {
        System.out.println("Todo esta funcionando de maravilla");
        System.out.println("Este es el segundo mensaje");
        Suma sum=new Suma();
        Multiplicacion multi=new Multiplicacion();
        int a=10,b=35;
        int c=sum.sumar(a, b);
        System.out.println("Suma es :"+c);
        //Vamos a hacer una funcion que multiplique
        float d=5f,e=15f;
        float g=multi.multiplicar(d, e);
        System.out.println("Multiplicacion :"+g);
        System.out.println("Esta es una actualizacion de prueba");
        System.out.println("Nico-Student hizo esta modificación")
    }
    
}
