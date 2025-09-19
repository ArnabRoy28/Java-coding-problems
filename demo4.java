import java.util.Scanner;
class thsdemo{
     static int num=3;
    public void set()
    {
        num++;
    }
     public void get()
     {
         System.out.println(num);
     }
    
    //@author-Arnab Roy
}
   class demo4{
       public static void main(String[] args){
           thsdemo obj1 = new thsdemo();
           thsdemo obj2 = new thsdemo();
           thsdemo obj3 = new thsdemo();
           
          obj1.set(); //num=4 in obj1
          obj1.set();// num=5 in obj1
          obj2.set();// num=4 in obj2
          obj3.set();//num=4 in obj3
          obj3.set();//num=5 in obj3
          obj3.set();//num=6 in obj3
           
          obj1.get(); //prints 5
          obj2.get(); //prints 4
          obj3.get(); //prints 6
       }
   }

