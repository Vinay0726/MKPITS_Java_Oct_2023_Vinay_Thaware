let numbers = [];

// Initialize the array with numbers 1 to 25
for (let i = 1; i <= 25; i++) {
  numbers.push(i);
}

// Fisher-Yates shuffle algorithm
for (let i = numbers.length - 1; i > 0; i--) {
  const j = Math.floor(Math.random() * (i + 1));
  [numbers[i], numbers[j]] = [numbers[j], numbers[i]];
}

// Print the shuffled array
for (let i = 0; i < numbers.length; i++) {
  console.log(numbers[i]);
}
