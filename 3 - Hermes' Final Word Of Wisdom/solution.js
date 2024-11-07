function findLengthOfLastWord(sentence) {
    const words = sentence.trim().split(" ");
    return words.length === 0 ? 0 : words[words.length - 1].length;
}

process.stdin.resume();
process.stdin.setEncoding("utf-8");
let inputString = "";

process.stdin.on("data", (input) => {
    inputString += input;
});

process.stdin.on("end", () => {
    const inputLines = inputString.trim().split("\n");
    const N = parseInt(inputLines[0]);

    for (let i = 1; i <= N; i++) {
        const sentence = inputLines[i];
        console.log(findLengthOfLastWord(sentence));
    }
});
