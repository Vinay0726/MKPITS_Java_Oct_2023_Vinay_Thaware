let num1 = 1,
  num2 = 0,
  num;

for (let i = 1; i <= 10; i++) {
  console.log(num2);
  num = num1 + num2;
  num1 = num2;
  num2 = num;
}
