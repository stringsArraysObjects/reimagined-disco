/*PARAMETERS: a SinglyLinkedListNode pointer to the head of the list
*             an integer value to insert as data in your new node
*             an integer position to insert the new node, zero based indexing
*RESULT:     Given the pointer to the head node of a linked list and an integer 
*            to insert at a certain position, create a new node with the given 
*            integer as its  attribute, insert this node at the desired position 
*            and return the head node. 
*/
class Result {

    /*
     * Complete the 'insertNodeAtPosition' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER data
     *  3. INTEGER position
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
     SinglyLinkedListNode preNode = llist;
        for(int i = 0; i < position - 1; i++){
            preNode = preNode.next;
        }
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        node.next = preNode.next;
        preNode.next = node;
        return llist;
    }

    

}