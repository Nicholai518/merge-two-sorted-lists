public class Main {

	public static void main(String[] args) {

		// Example 1
		// List 1: 1, 2, 4
		ListNode listOneNodeThree = new ListNode(4);
		ListNode listOneNodeTwo = new ListNode(2, listOneNodeThree);
		ListNode listOneHead = new ListNode(1, listOneNodeTwo);


		// List 2: 1, 3, 4
		ListNode listTwoNodeThree = new ListNode(4);
		ListNode listTwoNodeTwo = new ListNode(3, listTwoNodeThree);
		ListNode listTwoHead = new ListNode(1, listTwoNodeTwo);

		ListNode mergedListHead = mergeTwoLists(listOneHead, listTwoHead);
	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		ListNode tail = new ListNode();
		ListNode head = tail;  // tail gets farther and farther away

		if (list1 == null) {
			return list2;
		} else if (list2 == null) {
			return list1;
		}
		// both objects have values
		else if(list1 == null && list2 == null) {
			return head;
		}

		// assign head
		if (list1.val < list2.val) {
			tail.val = list1.val;

			// need to move the pointer
			list1 = list1.next;
		} else {
			tail.val = list2.val;
			// need to move the pointer
			list2 = list2.next;
		}


		// whichever node is smaller
		while (list1 != null & list2 != null) {

			//if list1 is less than
			if (list1.val <= list2.val) {

				// update tail.next to the list1 node
				tail.next = new ListNode();
				tail.next.val = list1.val;

				// update the tail to the newly created node
				tail = tail.next;

				// update the pointer for list1
				list1 = list1.next;
			} else {
				// update tail.next to the list2 node
				tail.next = new ListNode();
				tail.next.val = list2.val;

				// update the tail to the newly created node
				tail = tail.next;

				// update the pointer for list2
				list2 = list2.next;
			}
		}


		// need to cover an edge case where one list is null but the other is not
		if (list1 == null) {
			while (list2 != null) {
				// update tail.next to the list2 node
				tail.next = new ListNode();
				tail.next.val = list2.val;

				// update the tail to the newly created node
				tail = tail.next;

				// update the pointer for list2
				list2 = list2.next;
			}
		} else if (list2 == null) {
			while (list1 != null) {

				// update the tail.next to the list1 node
				tail.next = new ListNode();
				tail.next.val = list1.val;

				// update the tail to the newly created node
				tail = tail.next;

				// update the pointer for list1
				list1 = list1.next;
			}
		}
		return head;
	}
}
