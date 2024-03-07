/*PARAMETER: a reference to the head of a DoublyLinkedList
* RESULT:   Given the pointer to the head node of a doubly linked list, 
            reverse the order of the nodes in place. That is, change 
            the next and prev pointers of the nodes so that the direction 
            of the list is reversed. Return a reference to the head node 
            of the reversed list.
*/






public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
     DoublyLinkedListNode prev = null;

    while (llist != null) {
        DoublyLinkedListNode next = llist.next;
        llist.next = prev;
        llist.prev = next;

        prev = llist;
        llist = next;
    }

    return prev;
}
    

}
