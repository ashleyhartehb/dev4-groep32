//Quick sort algoritme
// Sorteren van images gebaseerd op hun colorValue

var colorValues = [2.5, 0.2, 5, 3.8];
function swap(colorValues, leftIndex, rightIndex){
    var temp = colorValues[leftIndex];
    colorValues[leftIndex] = colorValues[rightIndex];
    colorValues[rightIndex] = temp;
}
function partition(colorValues, left, right){
    //Variabelen aanmaken voor middelste en uiterste elementen
    var pivot = colorValues[Math.floor((right+left)/2)], i = left, j = right;
    while(i<=j){
        while(colorValues[i] < pivot){
            i++;
        }
        while(colorValues[j] > pivot){
            j--;
        }
        if(i<=j){
            //Omwisselen van de 2 elementen
            swap(colorValues, i, j);
            i++;
            j--;
        }
    }
    return i;
}
function quickSort(colorValues, left, right){
    var index;
    if(colorValues.length > 1){
        //Return index van parition
        index = partition(colorValues, left, right);
        if(left<index-1){
            quickSort(colorValues, left, index-1);
        }
        if(index<right){
            quickSort(colorValues, index, right);
        }
    }
    return colorValues;
}

//Eerste aanroep van quick sort
var sortedArray = quickSort(colorValues, 0, colorValues.length-1);
//Print array in console
console.log(sortedArray);