/** 
 * @description Different ways to search an array 
 *
 * @example First, sort the array used for testing.
 * 
 */
let test_bs = [1000,9,1,4,78,34,23,65,23,4,6,8,99,65,4,5,9,0];
console.log(test_bs);
let fn = (a,b)=>{return a - b}; // ascending order // b - a = descending order
let sorted = test_bs.sort(fn);
/**/

/**
 * @description These variable arguments are used for all model tests
 * @param {array} arr = sorted in ascending order array used for input
 * @param {int} value = value to search for 
 */


/**
 * perfect filter for values equal to and more/less 
 * 
 */  
let checkValue;
let _value = 45;
let array_dedup = new Set(sorted.filter(count => count >= `${_value}`));
console.log('Filtered set for values greater than 45: ');
console.log(array_dedup);


/**
 * Search the Set
 */
const search_Set = (arr,value)=>{
    sorted_set = new Set(arr);
    console.log('Complete set without a value filter: ');
    console.log(sorted_set);
    let is_found = sorted_set.has(value) ? `Found : ${value}` : `not Found : ${value}`;
    console.log(is_found); 
} 
    
/**
 * perfect
 */  
search_Set(sorted, 99);  


/**
 * Iterative Binary Search
 */
const binary_search = (arr,value)=> {
    let low = 0;
    let mid = 0;
    let high = arr.length - 1;
    while (low <= high){
        console.log('try_b_search');
        mid = Math.floor((high+low)/2);
        console.log('mid: ' + mid);
        if(value == arr[mid]){
            console.log('Found: ' + value);
            return true;
        } else if (value > arr[mid]) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    console.log('not Found: ' + value);
    return false;
}


/**
 * perfect 
 */
binary_search(sorted, 65);


/**
 * Recursive binary search 
 */
const BS_search_rec = (arr, value) => {
    const BS = (arr, value)=>{
        return BS_Helper(arr, value, 0, arr.length -1);
    }
    const BS_Helper = (arr,value, left, right)=> {
        if(left > right){
            return false;
        }
        console.log('try_recursive_helper');
        mid = Math.floor((left+right)/2);
        console.log(`mid: ${arr[mid]} >` + mid);
        if(value === arr[mid]){
                console.log('Found: ' + value);
                return true;
            } else if (value < arr[mid]) {
                console.log('not Found: ' + value);
                return BS_Helper(arr, value, left, mid - 1);
            } else {
                console.log('not Found: ' + value);
                return BS_Helper(arr, value, mid + 1, right)
            }  
    }
    BS(arr,value); 
}

/**
 * perfect 
 */
BS_search_rec(sorted, 23) 

