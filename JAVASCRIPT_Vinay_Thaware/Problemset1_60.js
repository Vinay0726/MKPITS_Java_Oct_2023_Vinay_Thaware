let result={ Vinay:75,
    Raj:73,
    Sanket:67,
}

for (let index = 0; index <Object.keys(result).length ; index++) {
    let  key= Object.keys(result)[index];
    console.log(`Name : ${key}, Marks :${result[key]}`);
    
}