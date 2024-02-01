package accessmodifiers2;

import accessmodifiers1.A;

public class D {
    public static void main(String[]args){
        A obj = new A() ;
//       System.out.println(obj.x);//default is not accessible outside the package.
//       System.out.println(obj.y);//private not accessible outside the class.
         System.out.println(obj.w);//public is accessible everywhere the object is available
//       System.out.println(obj.z);//protected will not be accessible outside package in non-subclass
    }
    }

