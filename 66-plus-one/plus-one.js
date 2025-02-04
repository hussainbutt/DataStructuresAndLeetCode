/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function (digits) {
    let i = digits.length - 1;
    let addDigit = false;
    while (true) {
        if (i < 0) break;
        if (digits[i] == 9){
            digits[i]=0;
            if(i==0) {
                addDigit = true;
                digits[i] = 1;
            }
                
        }else{
            digits[i]++;
            break;
        }
        
        i--;
    }
    if(addDigit){
        digits.push(0);
    }
    return digits;
};