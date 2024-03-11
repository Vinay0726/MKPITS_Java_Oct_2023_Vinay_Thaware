// For in->use in object
let getData = {
  name: "vinay",
  age: 23,
  city: "Nagpur",
};

for (const key in getData) {
  console.log(key, getData[key]);
}
