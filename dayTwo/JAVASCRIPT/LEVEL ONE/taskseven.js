const prompt = require("prompt-sync")()

let radius = Number(prompt("Enter the radius:  "));

const circumference = 2 * (22.0 /7) * radius;

console.log("circumference: ", circumference)
