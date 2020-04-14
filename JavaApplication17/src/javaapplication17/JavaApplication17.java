package javaapplication17;

public class JavaApplication17 
{
 
    public static void main(String[] args)
    {
        System.out.println("Todo esta funcionando de maravilla");
        System.out.println("Este es el segundo mensaje");
        Suma sum=new Suma();
        int a=10,b=35;
        int c=sum.sumar(a, b);
        System.out.println("Suma es :"+c);
    }
    
}
