let myNum = [4, 10, 35, 27, 20, 55];

let filterNum=myNum.filter(greater_than);//pass a text crete a new array

function greater_than(num) {
  return num > 25;
}

console.log(filterNum)
