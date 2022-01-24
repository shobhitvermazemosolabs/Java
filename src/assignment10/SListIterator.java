package assignment10;

import java.util.Scanner;

public class SListIterator {
    public static SList<Integer> getIteratorInsert(){
        SList<Integer> head=null;
        Scanner in=new Scanner(System.in);
        int data=in.nextInt();
        SList<Integer> temp=null;
        while(data!=-1){
            if(head==null){
                head=new SList<>(data);
                temp=head;
                data=in.nextInt();
            }
            else
            {
                SList<Integer> newnode=new SList<>(data);
                temp.next=newnode;
                temp=temp.next;
                data=in.nextInt();
            }
        }
        return head;
    }
    public static SList<Integer> getIteratorDelete(SList<Integer> head){
        if(head==null){
            return null;
        }
        SList<Integer> temp=head;
        SList<Integer> lastNode=null;
        while(temp.next!=null){
            if(temp.next.next==null){
                lastNode=temp.next;
                temp.next=null;
                break;
            }
            temp=temp.next;
        }
        return lastNode;
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
         SList<Integer> head=getIteratorInsert();
         SList<Integer> deletedNode=getIteratorDelete(head);
         if(deletedNode!=null){
             System.out.println(deletedNode.data);
         }
         else
         {
             System.out.println("the List is empty");
         }
    }
}
