package addTwoNumbers;

/**
 * Created by zy118686 on 16/10/27.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode begin = new ListNode(0);
        ListNode nextNode = null ;

        if(l1==null && l2==null){
            return begin;
        } else if(l1==null ){
            return l2;
        }else if(l2 ==null){
            return l1;
        }else {
            while (l1 != null || l2 != null || nextNode!=null) {
                if(nextNode == null ){
                    begin.val = l1.val + l2.val;
                    nextNode = begin;
                    l1 = l1.next;
                    l2 = l2.next;
                }else{
                    if(l1==null && l2==null){
                        if(nextNode.val >=10) {
                            nextNode.val-=10;
                            ListNode next = new ListNode(1);
                            nextNode.next = next;
                        }
                        nextNode = null;
                    }else if(l2==null){
                        ListNode next = new ListNode(0);
                        if(nextNode.val >= 10){
                            nextNode.val -= 10;
                            next.val = l1.val + 1;
                        }else{
                            next.val = l1.val;
                        }
                        nextNode.next = next;
                        l1 = l1.next;
                        nextNode = next ;
                    }else if(l1==null){
                        ListNode next = new ListNode(0);
                        if(nextNode.val >= 10){
                            nextNode.val -= 10;
                            next.val = l2.val + 1;
                        }else{
                            next.val = l2.val;
                        }
                        nextNode.next = next;
                        l2 = l2.next;
                        nextNode = next ;
                    }else{
                        ListNode next = new ListNode(0);
                        if(nextNode.val >= 10){
                            nextNode.val -= 10;
                            next.val = l1.val + 1 + l2.val;
                        }else{
                            next.val = l1.val+l2.val;
                        }
                        nextNode.next = next;
                        l1 = l1.next;
                        l2 = l2.next;
                        nextNode = next ;
                    }
                }
            }
            return begin;
        }
    }


    public static void main(String[] ars){

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode l1 = new ListNode(1);
        ListNode l12 = new ListNode(8);
     //   ListNode l13 = new ListNode(3);
        l1.next=l12;
     //   l12.next=l13;

        ListNode l2 = new ListNode(0);
    //    ListNode l22 = new ListNode(6);
     //   ListNode l23 = new ListNode(4);
     //   l2.next=l22;
     //   l22.next=l23;

        ListNode listNode =addTwoNumbers.addTwoNumbers(l1,l2);

        System.out.println(listNode.val);
        System.out.println(listNode.next.val);
      //  System.out.println(listNode.next.next.val);
    }
}
