
const solution = (value, tree) => {
let Node = class B {
        constructor(value){
            this.value = value;
            this.left = null;
            this.right = null;
        }}
    
let BST = class A {
        constructor (root) {
            this.root = new Node (root);
            // this.arr = arr;
            this.count = 0;
            this.mins = 0;
            this.maxs = 0;
            this.output = [];
        }
        
        size () {
            return this.count;
        }
        
        summed () {
        // sum left and right sides according to array order
        // this case: 15, 3, 2, 12, 36, 28, 39
        this.add(15);
        this.add(3);
        this.add(2);
        this.add(12);
        this.add(36);
        this.add(28);
        this.add(39);
        // this.preOrder();
        console.log(this.min());
        console.log(this.max());
            if (this.mins > this.maxs) {
                return `Left:: ${this.mins}`;
            } else if (this.mins == this.maxs) {
                    return `Equal:: mins/${this.mins} maxs/${this.maxs}`;
                } else {
                    return `Right:: maxs/${this.maxs}`;
            
            }
        }
        
        add (value) {
            this.count += 1;
            let newNode = new Node (value);
            if (value == this.root){ 
                console.log('root value inserted') 
                return
            };
            const searchNAddToTree = node => {
                // if value < node.value go left
                if (value < node.value) {
                    if (!node.left){
                    node.left = newNode;
                    // if left node check left node again
                    } else {
                        searchNAddToTree(node.left)
                    }
                    
                }
                // if value > node.value go right
                else if (value > node.value) {
                     if (!node.right){
                     node.right = newNode;
                    // if right node check right node again
                     } else {
                        searchNAddToTree(node.right);
                     }
                 }
                
            }
            searchNAddToTree(this.root);
        };
        
        min () {
            let current = this.root;
            while (current.left){
            this.mins += current.left.value;
            current = current.left 
            }
            console.log(`Mins:: ${this.mins}`);
            return current.value;
        }
        
        max () {
            let current = this.root;
            while (current.right) {
                this.maxs += current.right.value;
                current = current.right;
            }
            console.log(`Maxs:: ${this.maxs}`);
            return current.value;  
        }

        contains (value){
            while (currentNode){
            if (value === currentNode.value){
                return value;
            } else if (value < currentNode.value){
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
            return false;
            }
        }

        /**
         * DFS
         * 
         * */ 
        // inOrder 
        // left, root, right
        // 2, 3, 12, 15, 28, 36, 39
        inOrder () {
            let result = [];
            const traverse = node => {
                if (node.left) traverse(node.left)
                result.push(node.value)
                if (node.right) traverse(node.right)
            };
            return result;
        }

        // preOrder
        // root, left, right
        // 15, 3, 2, 12, 36, 28, 39
        preOrder () {
            let result = [];
            const traverse = node => {
                result.push(node.value)
                if (node.left) {
                    traverse(node.left)
                }
                if (node.right){
                    traverse(node.right);
                }
            }
            traverse(this.root);
            return result;
        }
        
        // postOrder 
        // left, right, root
        // 2, 12, 3, 28, 39, 36, 15
        postOrder () {
            let result = [];
            const traverse = node => {
                if (node.left) traverse(node.left)
                if (node.right) traverse(node.right)
                result.push(node.value)
            }
            return result;
        }
        
        /** 
         *  BFS 
         * 
         *
         * use a queue!!
         * 15, 3, 36, 2, 12, 28, 39
         * 
         * */
        bfs () {
            let result = [];
            let queue = [];

            queue.push(this.root);

            while (queue.length){
                let current = queue.shift();
                result.push(current);

                if(current.left){
                    queue.push(current.left)
                }
                if(current.right){
                    queue.push(current.right)
                }
            }
            console.log(`Match: ${this.match(result)}`);
            return result;
            
        }

        match (arr) {
            this.output = arr;
            return this.output;
        }

        returnOutput () {
            return this.output;
        }}

let bs = new BST (value);
console.log(bs.summed());
}
solution(15);


