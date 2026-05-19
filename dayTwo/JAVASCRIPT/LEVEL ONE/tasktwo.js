const prompt = require("prompt-sync")()

let age = Number(prompt("Enter your age: "));
let fiveyears = age + 5
console.log("Your age in 5 years is ", fiveyears)
