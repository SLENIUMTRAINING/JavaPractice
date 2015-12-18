//Method Overloading example

public class overLoading{
  public static void main (String[] args){
  functionOverload obj = new functionOverload();
  obj.add(1, 2);
  obj.add(2.2, 3.3);
  obj.add("Big", "Moon");
  }

}

public class functionOverload{

  void add(int a, int b, int c){
    int sum = a+b+c;
    System.out.println("The Sum"+sum);
  }
  void add(double a, double b) // overlad
  {
    double sum = a+b;
    System.out.println("The Sum"+sum);
  }
  void add(String s1, String s2){
  String s = s1+s2;
  }
  
}
