const prompt = require("prompt-sync")()

let numberOne = Number(prompt("Enter first number: "));
let numberTwo = Number(prompt("Enter second number: "));
let numberThree = Number(prompt("Enter third number: "));

const average = (numberOne + numberTwo + numberThree) / 3;

console.log("Average", average.toFixed(2))
