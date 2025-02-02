/**
 * @param {string} s
 * @param {string[]} wordDict
 * @return {boolean}
 */

 function verifyBreak(w,wordDict,start,memo){
    if(start===w.length) return true;
    if(memo[start]!==undefined) return memo[start];
    for(let end=start+1;end<=w.length;end++){
        if(wordDict.includes(w.substring(start,end)) && verifyBreak(w,wordDict,end,memo)){
            
            return memo[start] = true;
        }
    }
    return memo[start] = false;
 }
var wordBreak = function(s, wordDict) {
    let memo = new Map();
    return verifyBreak(s,wordDict,0,memo);
};