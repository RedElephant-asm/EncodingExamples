@echo off
echo [ Compilation... ]
javac  -encoding utf8 -cp C:\Users\ksavchenko\Documents\Projects\Java\SimpleEncodings\production\*;C:\Users\ksavchenko\Documents\Projects\Java\SimpleDictionaryService\production\* ./src/Main.java -d ./build
echo [ Successfully compiled. ]