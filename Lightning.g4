grammar Lightning;
// Regras de Producao
// direita : letra '=' direita;
variaveis:  booleano |
            inteiro |
            cadeia |
            caracter |
            real
            ;
booleano: 'booleano' ID '=' BOOLEANO;
inteiro: 'inteiro' ID '=' INTEIRO;
cadeia: 'cadeia' ID '=' CADEIA;
caracter: 'caracter' ID '=' CARACTER;
real: 'real' ID '=' REAL;
// Terminais
BOOLEANO: 'true' | 'false';
INTEIRO: [0-9]+;
CADEIA: 'cadeia';
CARACTER: 'caracter';
REAL: [0-9]+.[0-9]+;
ID: [a-z][a-z0-9]*; 
SEP: [ \t\r\n] -> skip;