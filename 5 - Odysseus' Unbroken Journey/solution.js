function solve(s) {
    let i = 0, j = 0, ans = 0;
    const mp = new Map();
    
    while (j < s.length) {
        mp.set(s[j], (mp.get(s[j]) || 0) + 1);
        
        while (mp.get(s[j]) > 1) {
            mp.set(s[i], mp.get(s[i]) - 1);
            i++;
        }
        
        ans = Math.max(ans, j - i + 1);
        j++;
    }
    
    return ans;
}

const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

readline.question('', (t) => {
    let testCases = parseInt(t.trim());
    
    const processTestCase = () => {
        if (testCases > 0) {
            testCases--;
            readline.question('', (s) => {
                console.log(solve(s.trim()));
                processTestCase();
            });
        } else {
            readline.close();
        }
    };
    
    processTestCase();
});
