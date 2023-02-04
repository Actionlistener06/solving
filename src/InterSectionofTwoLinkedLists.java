public class InterSectionofTwoLinkedLists {


    private MergedTwoSortedLists.ListNode headA;
    private MergedTwoSortedLists.ListNode headB;

    public MergedTwoSortedLists.ListNode getIntersectionNode(MergedTwoSortedLists.ListNode headA, MergedTwoSortedLists.ListNode headB) {
        this.headA = headA;
        this.headB = headB;
        int skipA=0;
            int skipB=0;
            int intersectVal=0;
            while(headA.next!=null||headB.next!=null){
                if(headA!=headB){ headA=headA.next; skipA++; }
                else if(headA.val==headB.val){

                    headB=headB.next; headA=headA.next; skipB++; skipA++;}
                intersectVal=headB.val;
            }
            if(headA.val!=headB.val){return null;}
            return headA;

    }
    //More Convenient Solution
   /* public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //boundary check
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        //if a & b have different len, then we will stop the loop after second iteration
        while( a != b){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }

        return a;
    }*/
}
