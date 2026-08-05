function wordPattern(pattern, s) {
    let words = s.split(" ");

    
    if (pattern.length !== words.length) {
        return false;
    }

    let patternToWord = new Map();
    let wordToPattern = new Map();

    for (let i = 0; i < pattern.length; i++) {
        let letter = pattern[i];
        let word = words[i];

        
        if (patternToWord.has(letter)) {
            if (patternToWord.get(letter) !== word) {
                return false;
            }
        }

        // Check word → letter
        if (wordToPattern.has(word)) {
            if (wordToPattern.get(word) !== letter) {
                return false;
            }
        }

        // Store the mapping
        patternToWord.set(letter, word);
        wordToPattern.set(word, letter);
    }

    return true;
}