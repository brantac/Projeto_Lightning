grammar Lightning;
// Regras de Producao
declaracao: listaDeDeclaracaoDeVariaveis fdi;

listaDeDeclaracaoDeVariaveis
    :   tipoDaVariavel declaracaoDaVariavel (',' declaracaoDaVariavel)*
    ;

tipoDaVariavel
    :   BOOLEANO
    |   INTEIRO
    |   CADEIA
    |   CARACTER
    |   REAL
    ;

declaracaoDaVariavel
    :   atribuivel ('=' expressaoUnica)?
    ;

atribuivel
    :   ID
    ;

expressaoUnica
    :   expressaoUnica ('*' | '/' | '%') expressaoUnica
    |   expressaoUnica ('+' | '-') expressaoUnica
    |   expressaoUnica ('==' | '!=') expressaoUnica
    |   expressaoUnica ('<' | '>' | '<=' | '>=') expressaoUnica
    |   expressaoUnica '=' expressaoUnica
    |   ID
    |   literal
    ;

literal
    :   BooleanoLiteral
    |   numeroLiteral
    // |   cadeiaLiteral
    ;

numeroLiteral
    :   InteiroLiteral
    |   RealLiteral
    ;

// cadeiaLiteral
//     :   '"' (~["])* '"'
//     ;
//     :   ('"' CadeiaDeCaracter* '"')
    
fdi:    PontoVirgula;

// Terminais
BOOLEANO:               'booleano';
INTEIRO:                'inteiro';
CADEIA:                 'cadeia';
CARACTER:               'caracter';
REAL:                   'real';

/* BooleanoLiteral */
BooleanoLiteral:        'true' | 'false';

/* Fim da instrução */
PontoVirgula:           ';';

/* Identificador */
ID:                     [a-zA-Z][a-zA-Z0-9]*;

/* NumeroLiteral */
InteiroLiteral:         [-]?[0-9]+;
RealLiteral:            [-]?[0-9]+[.][0-9]+;

SEP: [ \t\r\n]+ -> skip;

/* Cadeia de Caracter */
// CadeiaDeCaracter:       ~["];
