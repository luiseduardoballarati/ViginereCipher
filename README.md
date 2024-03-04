# ViginereCipher
Coursework in Python and Java for University of Bath Unit Principles of Programming

Implementantion of the  Vigenere Cipher in Python and Java. In Java code, we read files to implement the algorithm.

A little about the cipher:

From Wikipedia, the free encyclopedia

The Vigenère cipher is named after Blaise de Vigenère, although Giovan Battista Bellaso had invented it before Vigenère described his autokey cipher.

The Vigenère cipher is a method of encrypting alphabetic text where each letter of the plaintext is encoded with a different Caesar cipher, whose increment is determined by the corresponding letter of another text, the key.

For example, if the plaintext is attacking tonight and the key is OCULORHINOLARINGOLOGY, then the first letter a of the plaintext is shifted by 14 positions in the alphabet (because the first letter O of the key is the 14th letter of the alphabet, counting from 0), yielding o;
the second letter t is shifted by 2 (because the second letter C of the key means 2) yielding v;
the third letter t is shifted by 20 (U) yielding n, with wrap-around;
and so on; yielding the message ovnlqbpvt eoeqtnh. If the recipient of the message knows the key, they can recover the plaintext by reversing this process.
