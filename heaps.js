class Heap {
    capacity = 3;
    items = new Array(this.capacity);
    size = 0;


    getAll () {
       return this.items;
    }

    getLeftChildIndex (parentIndex) {
        return Math.floor(parentIndex * 2 + 1);
    }

    getRightChildIndex (parentIndex) {
        return Math.floor(parentIndex * 2 + 2);
    }

    getParentIndex (childIndex, act) {
        console.log(`child index ${act}:  ${childIndex}`)
        return Math.floor((childIndex - 1) / 2); 
    }

    hasLeftChild (index) {
        return this.getLeftChildIndex(index) < this.size;
    }

    hasRightChild (index) {
        return this.getRightChildIndex(index) < this.size;
    }

    hasParent (index, act) {
        return this.getParentIndex(index, act) >= 0;
    }

    leftChild (index) {
        return this.items[this.getLeftChildIndex[index]];
    }

    rightChild (index) {
        return this.items[this.getRightChildIndex[index]];
    }

    isRoot (index) {
        return index == 0;
    }

    p (index, act) {
        let parentIndex = this.getParentIndex(index, 'confirmed parent of');
        console.log(`Parent index: ${parentIndex} == ${this.items[parentIndex]} / child value of: ${this.items[parentIndex]}`)
        return this.items[parentIndex];
    }

    swap (indexOne, indexTwo) {
        let temp = this.items[indexOne];
        console.log(`swapped: ${temp}`);
        this.items[indexOne] = this.items[indexTwo];
        console.log(`With: ${this.items[indexTwo]}`)
        this.items[indexTwo] = temp;
    }

    ensureExtraCapacity () {
        if (this.size == this.capacity) {
            this.capacity *= 2;
            console.log('Added capacity!')
        }
    }

    peek () {
        if (this.items.length == 0) {
            // console.log(new Error('Heap is empty!'));
            return new Error('Cannot peek empty heap!')};
        console.log('Peek: ' + this.items[0]);
        return this.items[0]; 
        
    }

    poll () {
        if (this.size == 0) {
            // console.log(new Error('Heap is empty!'));
            return new Error('Polled empty heap!')};
        let item = this.items[0];
        this.items[0] = this.items.pop();
        console.log('Polled: ' + item);
        this.heapifyDown();
        return item; 
    }

    add (item) {
        this.ensureExtraCapacity();
        this.items[this.size] = item;
        this.size++;
        console.log('added: ' + item)
        this.heapifyUp();
    }

    heapifyUp () {
        let smallerChildIndex = Math.floor(this.size - 1);

        /**
         *  MAX-heap
         * 
         * */  
        // while ( (this.items[smallerChildIndex]) > this.items[this.getParentIndex(smallerChildIndex, 'compared HUP')] ){
        //     // this.getParentIndex(smallerChildIndex, 'HUP assign'), smallerChildIndex = smallerChildIndex, this.getParentIndex(smallerChildIndex, 'HUP ref');
        //     this.swap(this.getParentIndex(smallerChildIndex, 'swap'), smallerChildIndex);
        //     console.log('Heaped up: ' + this.items[smallerChildIndex]);
        //     smallerChildIndex = this.getParentIndex(smallerChildIndex, 're-hash');
        //     console.log('Heaped up action...');
        // }

        /**
         *  MIN-heap
         * 
         * */  
        while(!this.isRoot(smallerChildIndex) && this.hasParent(smallerChildIndex)){
            if (this.items[smallerChildIndex] < this.items[this.getParentIndex(smallerChildIndex, 'swap')]){
                this.swap(this.getParentIndex(smallerChildIndex, 'swapped'), smallerChildIndex);
                smallerChildIndex = this.getParentIndex(smallerChildIndex, 're-check');
            } else {
                smallerChildIndex = this.getParentIndex(smallerChildIndex, 'crawl-up-min')
            }
         }
    }

    heapifyDown () {
        let root = 0;

        /**
         *  MAX-heap
         * 
         * */    
        // while (this.items[this.getLeftChildIndex(root)] !== undefined){
        //     let biggestChild = this.getLeftChildIndex(root)
        //     if (this.items[this.getRightChildIndex(root)] !== undefined
        //     && this.items[this.getRightChildIndex(root)] 
        //     > this.items[this.getLeftChildIndex(root)]){
        //         biggestChild = this.getRightChildIndex(root)
        //     }
        //     if (this.items[root] < this.items[biggestChild]){
        //         this.swap(root, biggestChild);
        //         root = biggestChild;
        //     } else {
        //         return;
        //     }
        // console.log('Heaped down action...');
        // }

        /**
         *  MIN-heap
         * 
         * */  
        while (this.items[this.getLeftChildIndex(root)] !== undefined){
            if ( this.items[root] > this.items[this.getLeftChildIndex(root)]) {
                this.swap(this.items[root], this.items[this.getLeftChildIndex(root)])
                root = this.getLeftChildIndex(root);
            } else if (this.items[root] < this.items[this.getLeftChildIndex(root)]) {
                root = this.getLeftChildIndex(root);
            } else {
                return;
            }
        }
    }
}

let heap = new Heap();

// MAX-heap test (perfect)
// heap.add(25);
// heap.add(5);
// heap.add(40);
// heap.add(70);
// heap.add(90);
// heap.add(44);

// MAX-heap test (perfect)
// heap.add(20);
// heap.add(15);
// heap.add(13);
// heap.add(9);
// heap.add(11)
// heap.add(10);
// heap.add(19);
// heap.add(17);
// heap.add(8);
// heap.add(5);

// MIN-heap test (testing)
// heap.add(25);
heap.add(10);
heap.add(17);
heap.add(99);
heap.add(20);
heap.add(15);

// General MAX-MIN test steps
// n~ poll to match n~ adds; because no sanitation for null/undefined
heap.peek();
let a = [];
console.log(heap.getAll());
a.push(heap.poll());
a.push(heap.poll());
a.push(heap.poll());
a.push(heap.poll());
a.push(heap.poll());
// a.push(heap.poll());
// a.push(heap.poll());
// a.push(heap.poll());
// a.push(heap.poll()); 

console.log('a array: ' + a)
console.log('heap: ' + heap.getAll());