package com.shoppingcart.testdrivendev;


class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
}

public class FlattenDLL {

    // Algorithm:
    // Check if the input is not null
    // if not null, traverse through the end of the list using the next pointer
    // if not null and if the child is not null, then make a note of the child pointer
    // if child pointer is not null, keep repeating the process  for the child dll
    public Node flattenSpecialDLL(Node currNode) {
        if(currNode != null){
            Node resultHead = new Node();
            resultHead.val = currNode.val;
            traverseCurrDLL(resultHead, currNode);
            return resultHead;
        }
        return null;
    }

    public void traverseCurrDLL(Node result, Node currNode){
        Node child = null;
        while(currNode != null){
            result.next = currNode.next;
            result.prev = currNode.prev;
            if(result.child != null){
                child = result.child;
            }
        }
        if(child != null){
            traverseCurrDLL(result, child);
        }
    }
}
