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

expressaoEmSequencia
    :   expressaoUnica (',' expressaoUnica)*
    ;

expressaoUnica
    :   expressaoUnica ('*' | '/' | '%') expressaoUnica
    |   expressaoUnica ('+' | '-') expressaoUnica
    |   expressaoUnica ('==' | '!=') expressaoUnica
    |   expressaoUnica ('<' | '>' | '<=' | '>=') expressaoUnica
    |   expressaoUnica '=' expressaoUnica
    |   literal
    |   ID
    ;

literal
    :   CadeiaLiteral
    |   CaracterLiteral
    |   BooleanoLiteral
    |   numeroLiteral
    ;

numeroLiteral
    :   InteiroLiteral
    |   RealLiteral
    ;
    
instrucao
    :   bloco
    |   instrucaoSE
    |   instrucaoVazia
    ;

bloco
    : '{' listaDeInstrucoes '}'
    ;

listaDeInstrucoes
    : instrucao+
    ;

instrucaoSE
    :   SE '(' expressaoEmSequencia ')' instrucao (SenaoSe instrucao)?
    ;

instrucaoVazia
    :   PontoVirgula
    ;

fdi:    PontoVirgula;

// --------------------------------------------------------
// Terminais
ComentarioDeUmaLinha: '//' ~[\r\n]* -> channel(HIDDEN);

BOOLEANO:               'booleano';
INTEIRO:                'inteiro';
CADEIA:                 'cadeia';
CARACTER:               'caracter';
REAL:                   'real';

SE:                     'se';
SenaoSe:                'senaose';

/* BooleanoLiteral */
BooleanoLiteral:        'true' | 'false';

/* Fim da instrução */
PontoVirgula:           ';';

/* Cadeia literal com aspas duplas */
CadeiaLiteral
    :   '"' (~["\\\r\n])* '"'
    ;

/* Caracter literal */
CaracterLiteral
    :   '\'' (~["\\\r\n]) '\''
    ;

/* Identificador */
ID:                     [a-zA-Z][a-zA-Z0-9]*;

/* NumeroLiteral */
InteiroLiteral:         [-]?[0-9]+;
RealLiteral:            [-]?[0-9]+[.][0-9]+;

SEP: [ \t\r\n]+ -> skip;

