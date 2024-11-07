function findSecondLargestPower(n, powers) {
    let max = -1;
    let secondMax = -1;
    for (const power of powers) {
        if (power > max) {
            secondMax = max;
            max = power;
        } else if (power > secondMax && power < max) {
            secondMax = power;
        }
    }
    return secondMax;
}

// Read input and process it
process.stdin.resume();
process.stdin.setEncoding("utf-8");
let inputString = "";
process.stdin.on("data", (input) => {
    inputString += input;
});

process.stdin.on("end", () => {
    const inputLines = inputString.trim().split('\n');
    const t = parseInt(inputLines[0].trim(), 10);
    let line = 1;

    for (let i = 0; i < t; i++) {
        const n = parseInt(inputLines[line].trim(), 10);
        const powers = inputLines[line + 1].trim().split(' ').map(Number);
        line += 2;
        console.log(findSecondLargestPower(n, powers));
    }
});
