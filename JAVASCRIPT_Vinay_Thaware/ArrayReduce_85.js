let myNum = [38, 29, 92, 19, 30, 45];

let reduceNum = myNum.reduce(add); //reduce the array into single value

function add(x,y) {
  return x+y
}

console.log(reduceNum);
