let myCity=[`Pune`,`Mumbai`,`Nagpur`,`Agra`];
//for of Loop
for (const c of myCity) {
    console.log(c); 
}

//Using Indexing
console.log("---------------------------")
console.log(myCity[0]);
console.log(myCity[1]);
console.log(myCity[2]);
console.log(myCity[3]);

//using for loop
console.log("------------------------------");
for (let index = 0; index < myCity.length; index++) {
    console.log(myCity[index])
    
}