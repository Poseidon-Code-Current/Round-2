function findMaximumLifeEnergy(powers) {
    let maxAns = 1;
    for (let i = 0; i < 5; i++) {
        powers.sort((a, b) => a - b); 
        powers[0]++; // Increase the smallest element        
    }
    for (let j = 0; j < 3; j++) {
        maxAns *= powers[j]; // Calculate product
    }
    return maxAns;
}

process.stdin.resume();
process.stdin.setEncoding("utf-8");
let inputString = "";

process.stdin.on("data", function (input) {
    inputString += input;
});

process.stdin.on("end", function () {
    const inputs = inputString.trim().split("\n");
    const t = parseInt(inputs[0]); // Number of test cases
    let output = [];

    for (let i = 1; i <= t; i++) {
        let powers = inputs[i].trim().split(" ").map(Number);
        output.push(findMaximumLifeEnergy(powers)); // Calculate and store result
    }
    
    console.log(output.join("\n")); // Output all results at once
});
