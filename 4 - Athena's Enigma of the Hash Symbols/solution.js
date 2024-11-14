function checkIfPairExists(scroll) {
    let hashCount = 0;
    let set = new Set();
    let numbers = [];

    for (let char of scroll) {
        if (char === '#') {
            hashCount++;
        } else if (!isNaN(char)) {
            numbers.push(Number(char));
        }
    }

    for (let num of numbers) {
        let key = hashCount - num;
        if (set.has(key)) {
            return "Yes";
        }
        set.add(num);
    }
    return "No";
}

// Input reading
const readline = require("readline").createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];
readline.on("line", (line) => input.push(line.trim()));
readline.on("close", () => {
    const T = parseInt(input[0]);
    for (let i = 1; i <= T; i++) {
        console.log(checkIfPairExists(input[i]));
    }
});
