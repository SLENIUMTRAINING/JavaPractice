//Array is used to store data Integer, double, float or String. 
// two values - index and value associated with an array
// Index begins with 0 hence array of size 5 : int array[5];
// indexes in this array : first one - array[0]=2 to last one - array[4]=6; 2 and 6 are stored values. 

public class Arrays{
  public static void main (String[] args){
    int array[] = {2,6,5,3,4}; //generally we dont specify the size of an array
    System.out.println("Index\tValue");
    
    for (int counter=0; counter<5;counter++){
        System.out.println(counter+"\t"+array[counter]);
    }
  }
}
