const prompt = require("prompt-sync")()

let celsius = Number(prompt("Enter temperature in celsius: "));


const fahrenheit = (1.8 * celsius) + 32;

console.log("fahrenheit: ", fahrenheit)
