/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajith Bhanuka
 */
public class CS2022LinkedList<E> {
    private Node<E> head;
    private int length;
    
    public void init_list(){ 
        this.head = null;
        this.length = 0;
    }

    public boolean is_empty(){
        return(length == 0);
    }

    public Node<E> search(E element){
        Node<E> current = head;
        while (current != null){
            if( current.getElement() == element){
                return current;
            }
            else{
                current = current.getNext();
            }
        }
        return null;
    }

    public E delete(E element){
        // Found at the start
        Node<E> current = head;
        if (current.getElement() == element){
            head = current.getNext();
            this.decrementLength();
            return current.getElement();
        }
        else{
            Node<E> previous = current;
            current = current.getNext();
            while( current != null){
                if( current.getElement() == element){
                    previous.setNext(current.getNext());
                    this.decrementLength();
                    return current.getElement();
                }
                else{
                    previous = current;
                    current = current.getNext();
                            
                }
            }
            return null;
        }
    }

    public E deleteNodeAt(int i){
        if(i> length -1){
            return null;
        }
        else{
            Node<E> current = head;
            Node<E> previous = head;
            for( int j =1; j < i; j++){
                previous = current;
                current = current.getNext();
            }
            previous.setNext(current.getNext());
            this.decrementLength();
            return current.getElement();
        }
    
    }

    public boolean insert(E element){
        /*Node newNode = new Node();
        newNode.setElement(element);
        newNode.setNext(head);
        head = newNode;
        this.incrementLength();
        return true;
        */
        if (this.length==0){
            Node<E> temp = new Node();
            temp.setElement(element);
            head = temp;
            incrementLength();
            return true;
            
        }
        else{
            Node<E> current = head;
            while(current.getNext()!= null){
                current = current.getNext();
            }
            Node<E> temp = new Node();
            temp.setElement(element);
            current.setNext(temp);
            incrementLength();
            return true;
        }
     }

    public boolean insertAt(E element, int i){
        Node<E> current = head;
        //Node<E> previous = current;
        
        for(int j = 1; j < i-1; j++){
            //previous = current;
            current = current.getNext();
        }
        Node<E> temp = new Node();
        temp.setElement(element);
        temp.setNext(current.getNext());
        current.setNext(temp);
        return true;
    }

    public void setHead(Node<E> head) {
            this.head = head;
    }

    public Node<E> getHead() {
            return head;
    }

    public void incrementLength() {
            this.length++;
    }
    public void decrementLength() {
            this.length--;
    }
    
    public int getLength() {
            return length;
    }
    
    public void show(){
        Node<E> current = head;
        while(current!= null){
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }

    
    
}
