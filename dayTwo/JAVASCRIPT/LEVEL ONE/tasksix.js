const prompt = require("prompt-sync")()

let width = Number(prompt("Enter width number: "));
let length = Number(prompt("Enter length number: "));

const area = width * length;

console.log("Area: ", area)
