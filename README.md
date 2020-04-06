# Caesar-Cipher-Encryptor
- input: non-empty string of lowercase letters and a non-negative integer representing a key
- write a function that returns a new string obtained by shifting every letter in the input string by k positions in the alphabet, where k is the key.
- this same way as wrap around alphabet letter
# Solution:
- A String is build from array of character.
- in decimal 97 to 122 is the letter a to z with 26 letter
- the key will wrap arround 26
- two parameters are string and the key
- the key will be any number we should make it already wrap around, it mean that the key will be in domain of 0 to 26;
- break the input in to an array call it new string array
- took the array and process it shift each letter to right one
- return the array in String 
- time complexity : O(N)
