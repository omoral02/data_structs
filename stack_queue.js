//Stack
// arr.push(value);
// arr.pop();
// linear data 
// LILO
class Stack  {
    constructor(){
        this.storage = {};
        this.size = 0;
    }
    push (item) {
        this.size++
        this.storage[this.size] = item;
        // this.push(item)
    }
    pop () {
        // this.arr.pop();
        let removed = this.storage[this.size];
        delete this.storage[this.size]
        this.size--
        return removed
    }
    peek () {
        return this.storage[this.size];
    }
}

//Queue
// arr.push(value);
// arr.shift();
// linear data
// FIFO
class Queue {
    constructor () {
        this.queue = [];
        this.head = 0;
        this.tail = 0;
    }

    enqueue (item) {
        this.storage[this.tail] = item;
        this.tail++; 
        // this.queue.push(item);
    }

    dequeue () {
        let removed = this.storage[this.head];
        delete this.storage[this.head];
        this.head++;
        return removed;
        // this.queue.shift();
    }
}

