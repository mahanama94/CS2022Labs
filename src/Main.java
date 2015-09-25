
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajith Bhanuka
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a link list
        CS2022LinkedList myList = new CS2022LinkedList();
        
        //check whether the link list is empty
        
        if(myList.is_empty()){
            System.out.println("List is Empty");
        }
        else{
            
            System.out.println("List not is Empty");
        }
        
        //add 5 nodes to link list
        
        myList.insert(5);
        myList.insert(10);
        myList.insert(15);
        myList.insert(20);
        myList.insert(25);
        
        myList.show();
        
        //check whether the link list is empty
        
         if(myList.is_empty()){
            System.out.println("List is Empty");
        }
        else{
            
            System.out.println("List not is Empty");
        }
         
        //print the length of the link list
         
         System.out.println("Length of list :"+ myList.getLength());
         
        //delete two elements from the link list
        
         myList.deleteNodeAt(4);
         
         System.out.println("--myList.deleteNodeAt(4)--");
         myList.show();
         
         myList.delete(15);
        
         System.out.println("--myList.delete(15);--");
         myList.show();
        //search link list for an existing elements
         
          System.out.println("Length of list :"+ myList.getLength());
          
          myList.insertAt(100, 2);
           System.out.println("--myList.insertAt(100, 2);--");
           
           myList.show();

    }
    
}
