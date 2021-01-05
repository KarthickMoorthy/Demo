package classics;

/*
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * */
public class MergeList {
    public static void main(String[] args) {

    }

    // Tail recursion
    public ListNode mergeTwoListsRecursion(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode head = null;
        if(l1.val <= l2.val) {
            head = l1;
            head.next = mergeTwoListsRecursion(l1.next,l2);
        }
        else {
            head = l2;
            head.next = mergeTwoListsRecursion(l1,l2.next);
        }
        return head;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(-1);
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode it1 =l1;

        ListNode it2 =l2;

        ListNode it = dummyNode;

        while(it1!=null && it2!=null){
            if(it1.val<it2.val){
                it.next = it1;
                it1 = it1.next;
                it = it.next;
            } else{
                it.next = it2;
                it2 =it2.next;
                it = it.next;
            }
        }

        while(it1!=null){
            it.next = it1;
            it1 = it1.next;
            it = it.next;
        }

        while(it2!=null){
            it.next = it2;
            it2 = it2.next;
            it = it.next;
        }

        return dummyNode.next;

    }
}

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
