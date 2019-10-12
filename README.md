# ShiftCypher

The Caesar cipher, also known as a shift cipher, is one of the simplest forms of encryption. It is a substitution cipher where each letter in the original message (called the plaintext) is replaced with a letter corresponding to a certain number of letters up or down in the alphabet.
Algorithm

The Caesar Cipher can be expressed in a more mathematical form as follows:

En(x) = (x+n) mod 26

In plain terms, this means that the encryption of a letter x is equal to a shift of x + n, where n is the number of letters shifted. The result of the process is then taken under modulo division, essentially meaning that if a letter is shifted past the end of the alphabet, it wraps around to the beginning i.e we again start from a.

Decryption of the encrypted text (ciphertext) is the opposite, just subtract to get back the original text.

Dn(x) = (x-n) mod 26
