//Quick sort algoritme
// Sorteren van images gebaseerd op hun colorValue

var colorValues = [2.5, 0.2, 5, 3.8];
function swap(colorValues, leftIndex, rightIndex){
    var temp = colorValues[leftIndex];
    colorValues[leftIndex] = colorValues[rightIndex];
    colorValues[rightIndex] = temp;
}