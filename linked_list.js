// Linked List (sequential access)
// singly = 1 node /  doubly = 2 nodes == linked lists 
// next() pointer / head.previous() next() 
class Node {
    constructor(value, previous, next){
        this.value = value;
        this.previous = previous || null;
        this.next = next || null;    
    }
}

class LinkedList {
    constructor(){
        this.head = this.tail = null;
    }

    append(value){
        if(!this.tail){
            this.head = this.tail = new Node(value);
        } else {
            let oldTail = this.tail;
            this.tail = new Node(value);
            oldTail.next = this.tail;
            this.tail.previous = oldTail;
        }

    }

    prepend(value){
        if (!this.head){
            this.head = this.tail = new Node(value);
        } else {
            let oldHead = this.head;
            this.head = new Node(value);
            oldHead.previous = this.head;
            this.head.next = oldHead;
        }
    }

    deleteHead(){
        if(!this.head){
            return 'Nothing left to delete!';
        } else {
            let removedHead = this.head;
            if(this.head === this.tail){
                this.head = this.tail = null;
            } else {
                this.head = this.head.next;
                this.head.previous = null;
            }
            return removedHead.value;
        }
    }

    deleteTail(){
        if(!this.tail){
            return 'Nothing left to delete!';
        } else {
            let removedTail = this.tail;
            if(this.head === this.tail){
                this.head = this.tail = null;
            } else {
                this.tail = this.tail.previous;
                this.tail.next = null;
            }
            return removedTail.value;
        }

    }

    search(value){
        let currentNode = this.head;
        while (currentNode){
            if(currentNode.value === value){
                return 'currentNode';
            }
            currentNode = currentNode.next
        }
        return `Not Found: ${value}`;
    }
}

let LL_test = new LinkedList();
LL_test.append(4);
LL_test.append(3);
LL_test.append(7);
LL_test.append(5);
console.log(LL_test);
console.log(LL_test.deleteHead());
console.log(LL_test.deleteTail());
console.log(LL_test);
console.log(LL_test.search(7));
console.log(LL_test.search(9));
console.log(LL_test.deleteHead());
console.log(LL_test.deleteTail());
console.log(LL_test); 