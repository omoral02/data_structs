const hashHelper = (key, size) => {
    let x = 0;
    let hashedKey = 0;
    for (x; x < key.length; x++) {
        hashedKey = key.charCodeAt(x);
    }
    return Math.floor(hashedKey % size);
}

class Hashtable {
    
    constructor () {
        this.size = 25;
        this.buckets = Array(this.size);
        console.log(this.buckets);
        this.buckets = this.mapBuckets();

    }

    mapBuckets () {
        let oldBuckets = this.buckets;
        let newBuckets = [];
        let x = 0;
        while (x < oldBuckets.length) {
            try {
                oldBuckets[x] = new Map();
                newBuckets.push(oldBuckets[x]);
                x++
            } catch (e) {
                console.log(e);
            }
        };
        console.log(newBuckets);
        return newBuckets;
    }

    insert (key, value) {
        this.buckets[this._hash(key)].set(key, value); 
    }

    remove (key) {
        let deleted = this.buckets[this._hash(key)].get(key);
        this.buckets[this._hash(key)].delete(key);
        return deleted;
    }

    search (key) {
        return this.buckets[this._hash(key)].get(key);
    }

    _hash (key) {
        return hashHelper(key, this.size);
    }
}

const hashtable = new Hashtable();
let buckets = ['serena', 'amy', 'rei', 'mina', 'darien'];
let values = ['moon', 'mercury', 'mars', 'jupiter', 'venus'];
// hashtable.insert('serena', 'moon');
// hashtable.insert('amy', 'mercury');
// hashtable.insert('rei', 'mars');
// hashtable.insert('mina', 'jupiter');
// hashtable.insert('darien', 'venus');
const searchAllIn = (table, buckets, values) => {
    let mapped_values = []
    let x = 0;
    while (x < buckets.length){
        table.insert(buckets[x], values[x]);
        console.group(`Bucket: ${buckets[x]}`)
        mapped_values.push(table.buckets[x]);
        console.log(mapped_values[x]);
        console.log(table.search(buckets[x]));
        x++;
    }
    return mapped_values; 
};
console.group(searchAllIn(hashtable, buckets, values));
