/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajith Bhanuka
 */
public class Node<E>{
    private E element;
    private Node<E> next;
    
    public Node(){
    }
    
    public void setElement(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
    
    public Node<E> getNext() {
        return next;
    }


    
    
}
