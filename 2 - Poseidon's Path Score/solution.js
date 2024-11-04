function calcPathScore(s) {
    let ans = 0;
    for (let i = 0; i < s.length - 1; i++) {
        ans += Math.abs(s.charCodeAt(i) - s.charCodeAt(i + 1));
    }
    return ans;
}

const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

readline.question('', t => {
    let count = parseInt(t);
    let inputs = [];
    readline.on('line', line => {
        inputs.push(line);
        if (inputs.length === count) {
            inputs.forEach(s => console.log(calcPathScore(s)));
            readline.close();
        }
    });
});
