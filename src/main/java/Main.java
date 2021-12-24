public class Main {

	public static void main(String[] args){

		// Example 1
		// List 1: 1, 2, 4
		ListNode listOneNodeThree = new ListNode(4);
		ListNode listOneNodeTwo = new ListNode(2, listOneNodeThree);
		ListNode listOneHead = new ListNode(1, listOneNodeTwo);


		// List 2: 1, 3, 4
		ListNode listTwoNodeThree = new ListNode(4);
		ListNode listTwoNodeTwo = new ListNode(3, listTwoNodeThree);
		ListNode listTwoHead = new ListNode(1, listTwoNodeTwo);

		ListNode mergedListHead = mergeTwoLists(listOneHead, listTwoHead );


	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode listNode = new ListNode();
		return listNode;
	}
}
