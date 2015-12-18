// Objects - have attributes and behaviour. 
//Classes - a template that describes the behaviours or states. 
// Animals - behaviours - dogs cats dinos
// You dont have to rewrite the code by using objects from the class. -Reusability
//Methods can execute class - but no attributes

// Programming models - 1. Procedural C, Fortran, Cobol, 2. Object Oriented - Java, C#, C++
// Procedural - Function or Method - program divided in. 
//OOP - Program gets divided in Classes and objects :Began in 1970s Xerox Palo Alto park office
/*
C++ Example : 
#include<studio.h>
#include<conio.h>
main()
{
int num1=40;
int num2=30;
int total = Findsum(num1, num2);
printf("%d", total);
}
int FindSum(int n1, int n2)
{
  return n1+n2;
}

*/
/*
public class LearningClass {
int id; //--Attributes
string name;// - 

  void display(){
    System.out.println(id+" "+name);// -- Behaviour
    }
*/

package javaapplication1;
public class ClassObject{
  public static void main(String[] args){
  Sum s = new Sum();
  s.num1=40;
  s.num2=30;
  int total=s.FindSum();
  System.out.println(total);
  }


}
  
/*--------------------sum.java-----------------*/

package javaapplication1;
public class Sum{

int num1;
int num2;
  public int FindSum(){
  return num1+num2;
  }


}
  
