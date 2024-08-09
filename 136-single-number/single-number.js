/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let xor = 0;
        nums.forEach( x=>{
            xor ^= x; 
        });
        return xor;
};