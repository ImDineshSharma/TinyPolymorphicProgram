// main class with main method

public class TEST{
  public static void main(String[] args){
  
  //create a polymorphic array
  Food[] foodArray = new Food[2];
  
  //create two objects for each subclass
  Burger bg = new Burger();
  Pizza pz = new Pizza();
  
  // assign objects as array elements
  foodArray[0] = bg;
  foodArray[1] = pz
  
  //enhanced for loop through each element to call their respective method
  for(Food x: foodArray){
      x.eat(); // the x is representing index position, therefore each time it will call a method as we instructed it to and that's
      //cox of POLYMORPHISM!!!
  } 
     
  }
}

// super class Food

public classs Food{
   public void eat(){
     System.out.println("This food is amazing");
   }
}

// sub class Burger
classs Burger extends Food{
   public void eat(){
     System.out.println("This Burger is amazing");
   }
}

// sub class Pizza
classs Pizza extends Food{
   public void eat(){
     System.out.println("This Pizza is amazing");
   }
}
