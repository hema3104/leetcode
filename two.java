class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Two {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        ListNode result = new ListNode();
        ListNode ans = result;
        int carry = 0;
        while (l1 != null && l2 != null) {

            int sum = carry + l1.val + l2.val;
            int digit = sum % 10;
            carry = sum / 10;

            l1 = l1.next;
            l2 = l2.next;

            result.next = new ListNode(digit);
            result = result.next;
        }

        while (l1 != null) {
            int sum = carry + l1.val;
            int digit = sum % 10;
            carry = sum / 10;
            result.next = new ListNode(digit);
            l1 = l1.next;
            result = result.next;
        }

        while (l2 != null) {
            int sum = carry + l2.val;
            int digit = sum % 10;
            carry = sum / 10;
            result.next = new ListNode(digit);
            l2 = l2.next;
            result = result.next;
        }

        if (carry != 0) {
            result.next = new ListNode(carry);
        }

        return ans.next;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        Two solution = new Two();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the resulting list
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }
}
