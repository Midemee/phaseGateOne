const {getLikes} = require("./FacebookLikes");

test("test that an empty array returns zero likes", ()=>{
    let names = [];
    message = "no one likes this";
    expect(getLikes(names)).toBe(message);
});


test("test that an array with one like displays one name", ()=>{
    let names = ["Bola"]
    let message = "Bola likes this"
    expect(getLikes(names)).toBe(message);
});


test("test that an array with two likes displays two name", ()=>{
    let names = ["Bola", "Tobi"]
    let message = "Bola and Tobi likes this"
    expect(getLikes(names)).toBe(message);
});


test("test that an array with three likes displays three names", ()=>{
    let names = ["Bola", "Tobi", "Paul"]
    let message = "Bola Tobi and Paul likes this"
    expect(getLikes(names)).toBe(message);
});


test("test that an array with more than three likes displays two names and the number of other likes", ()=>{
    let names = ["Bola", "Tobi", "Paul", "John", "peter", "Grace", "Esther", "David", "Ebuka"]
    let message = `${names[0]} ${names[1]} and ${names.length-2} others likes this`
    expect(getLikes(names)).toBe(message);
});
