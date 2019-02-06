//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
package lab07_linkedlists.linkedlist2;
public interface Linkable
{
   Comparable getValue();
   Linkable getNext();
   void setNext(Linkable next);
   void setValue(Comparable value);
}