class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null){
            return null;
        }

        ListNode list1 = reverse(l1);
        ListNode list2 = reverse(l2);

        ListNode ans = new ListNode();

        while(list1 != null && list2 != null){
            if(list1.val + list2.val >= 10){
                ans.next = new ListNode((list1.val+list2.val) % 10);
                ans.next = new ListNode((list1.val+list2.val) / 10);
                list1 = list1.next;
                list2 = list2.next;
            }else{
                if(ans.next != null){
                    ans.next.val += list1.val+list2.val;
                    if(ans.next.val >= 10){
                        ans.next.val %= ans.next.val;
                        ans.next.next = new ListNode((list1.val+list2.val) / 10);
                    }
                }else{
                    ans.next = new ListNode((list1.val+list2.val));
                }
                list1 = list1.next;
                list2 = list2.next;
            }
        }

        while(list1 != null){
            ans.next = new ListNode(list1.val);
            list1 = list1.next;
        }

        while(list2 != null){
            ans.next = new ListNode(list2.val);
            list2 = list2.next;
        }

        return reverse(ans.next);
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;

        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next!= null){
                next = next.next;
            }
        }

        return prev;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next = new ListNode(4);
        ListNode ans = obj.addTwoNumbers(l1,l2);
        System.out.println(ans.val + " ");

    }
}