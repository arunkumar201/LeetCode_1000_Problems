/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
     let a=new Set(nums);
    let j=0;
    for(let i of a){
        nums[j++]=i;
    }
     return  a.size;
};