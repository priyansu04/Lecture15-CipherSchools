package accessmodifiers2;

import accessmodifiers1.A;

public class C extends A {
    public static void main(String[]args){
        A obj = new A() ;
        C childObj =new C();
//       System.out.println(obj.x);//default is not accessible outside the package.
//       System.out.println(childObj.x);NOT visible
//       System.out.println(obj.y);//private not accessible outside the class.
//       System.out.println(childObj.x);NOT visible
         System.out.println(obj.w);//public is accessible everywhere the object is available.
         System.out.println(childObj.z);//protected will be visible in different package in subclass using object of subclass
    }
}
