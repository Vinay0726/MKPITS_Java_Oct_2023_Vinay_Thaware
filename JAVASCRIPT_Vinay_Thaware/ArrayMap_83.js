let myNum=[32,42,24,54,29]
//perform some operation in each element
myNum.map((value,index,Array)=>{

    console.log(value*2)

})

let square=myNum.map((value)=>{
    return value*value
})
console.log(square)