import java.util.*;
import java.lang.*;

class rect
{
public int a =10;
public int b =2;
public int area = a*b;

public String toString()
{
return String.format("lenght = %d , width = %d, area = %d ", a,b,area);
} 

}

class runclass
{

 public static void main(String args[])
    {  
        rect r = new rect();
        System.out.println(r);
        r.a=15;
        r.b = 10;
        r.area = r.a*r.b;
        System.out.println(r);
        rect s = new rect();
        System.out.println(s);
     }
}

