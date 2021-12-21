console.log("loneOnes (2): " + countLoneOnes(101));
console.log("loneOnes (1): " + countLoneOnes(1191));
console.log("loneOnes (0): " + countLoneOnes(1111));
console.log("loneOnes (0): " + countLoneOnes(462));

function countLoneOnes(a){
    //There really needs to be a built-in library for finding all
    //the digits in a number. *grumble*
    var count = 0;
    var num = a.toString();

    for(let i = 0; i < num.length; i++)
        if(num[i] == 1 && num[i-1] != 1 && num[i+1] != 1)
            count++;
    
    return count;
}