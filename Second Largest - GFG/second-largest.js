//{ Driver Code Starts
//Initial Template for javascript


'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();
});

function readLine() {
    return inputString[currentLine++];
}

function printList(res,n){
    let s="";
    for(let i=0;i<n;i++){
        s+=res[i];
        s+=" ";
    }
    console.log(s);
}


function main() {
    let t = parseInt(readLine());
    let i = 0;
    for(;i<t;i++)
    {
        let n = parseInt(readLine());
        let arr = new Array(n);
        let input_ar1 = readLine().split(' ').map(x=>parseInt(x));
        for(let i=0;i<n;i++){
            arr[i] = input_ar1[i];
        }
        let obj = new Solution();
        let res = obj.print2largest(arr, n);
        console.log(res);
        
    }
}// } Driver Code Ends




// } Driver Code Ends


//User function Template for javascript


/**
 * @param {number[]} arr
 * @param {number} n
 * @returns {number}
*/

class Solution{
    print2largest(arr,n){
      //if array Length is less than 2 then,there is no second largest item
    if (n < 3) {
        return -1;
    }
    var F_max =-1;  //First-largest item in an array
    var S_max = -1;  //Second-largest item in an array
    for (var i = 0; i < n; i++) {
        //check if current element is greater than first-largest item
        if (arr[i] > F_max) {
            S_max = F_max; //update second-largest item
            F_max = arr[i]; //update first-largest item
        }
        //check if current element is greater than second-largest item and not equal to first-largest item
        else if (arr[i] > S_max && arr[i] != F_max) {
            S_max = arr[i]; //update second-largest item
        }
    }
    return S_max;
}
}

