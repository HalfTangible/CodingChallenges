var array1 = [3, 7, 3, 2, 1, 5, 1, 2, 2, -2, 2]; //3
var array2 = [1, 7, 1, 7, 1, 7, 1]; //5
var array3 = [9, 5, 9, 5, 1, 1, 1]; //2
var array4 = [5, 6, 6, 7, 6, 3, 9]; //1
var array5 = [4, 4, 4, 9, 9, 9, 9]; //0

console.log("3 boomerangs: " + countBoomerangs(array1));
console.log("5 boomerangs: " + countBoomerangs(array2));
console.log("2 boomerangs: " + countBoomerangs(array3));
console.log("1 boomerang: " + countBoomerangs(array4));
console.log("0 boomerangs: " + countBoomerangs(array5));

function countBoomerangs(Array){
    var count = 0;
    //console.log(Array.length);

    for(let i = 0; i < Array.length - 2; i++){
        if(Array[i] == Array[i+2] && Array[i] != Array[i+1])
            count++;
    //console.log("Condition 1:" + Array[i] == Array[i+2]);
    //console.log("Condition 2:" + Array[i] != Array[i+1]);
        }
    //console.log("Inside countBoomerangs")
    
    return count;
}