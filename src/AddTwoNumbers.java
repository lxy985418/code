import java.util.Scanner;

/**
 * @program: LeetCode
 * @description:
 * @author: LeeXy
 * @create: 2020-03-03 22:30
 **/

public class AddTwoNumbers {
    public static class ListNode {
     int val;
     ListNode next;
         ListNode(int val) {
            this.val = val;
        }
    }
     static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         if(l1==null&&l2==null) {
             return null;
         }
         ListNode dumy = new ListNode(0);
         ListNode head = dumy;
         int addsum = 0;
         while(l1!=null||l2!=null||addsum!=0){
             int val1 = l1==null?0:l1.val;
             int val2 = l2==null?0:l2.val;
             int sum = val1+val2+addsum;
             head.next=new ListNode(sum%10);
             System.out.println(sum);
             addsum = sum/10;
             head=head.next;
             System.out.println(addsum);
               if(l1!=null)
                 l1 =l1.next;
               if(l2!=null)
                 l2 = l2.next;
         }
         return dumy.next;
    }


//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        if (l1 == null && l2 == null) return null;
//        ListNode dummy = new ListNode(0);
//        ListNode head = dummy;
//        int addOne = 0;
//
//        while (l1 != null || l2 != null || addOne != 0) {
//            int val1 = l1 == null ? 0 : l1.val;
//            int val2 = l2 == null ? 0 : l2.val;
//            int sum = val1 + val2 + addOne;
//            head.next = new ListNode(sum % 10);
//            head = head.next;
//            addOne = sum / 10;
//            if (l1 != null) l1 = l1.next;
//            if (l2 != null) l2 = l2.next;
//        }
//        return dummy.next;
//    }
//










    public static void main(String[] args) {
       ListNode l1 =new ListNode(2);
       ListNode l2 =new ListNode(5);
       l1.next=new ListNode(4);
       l2.next=new ListNode(6);
        ListNode listNode = addTwoNumbers(l1, l2);
        StringBuilder stringBuilder = new StringBuilder();
        while(listNode!=null){
            stringBuilder.append(listNode.val);
            listNode=listNode.next;
        }
        System.out.println(stringBuilder.toString());
        System.out.println("完成");
    }





//    public static void main(String[] args) {
//        ListNode l1 = new ListNode(2);
//        ListNode l2 = new ListNode(5);
//        l1.next = new ListNode(4);
//        l2.next = new ListNode(6);
//        System.out.println(print(addTwoNumbers(l1, l2)));
//    }
}
