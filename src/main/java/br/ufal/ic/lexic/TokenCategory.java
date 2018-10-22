package br.ufal.ic.lexic;

public enum TokenCategory {
    main,
    id,
    tInt,
    tFloat,
    tBool,
    tChar,
    tString,
    scopeBeg,
    scopeEnd,
    paramBeg,
    paramEnd,
    arrayBeg,
    arrayEnd,
    lineEnd,
    commaSep,
    colonSep,
    consNumInt,
    consNumFlo,
    consBool,
    consChar,
    consString,
    rwPrint,
    rwRead,
    rwLength,
    rwIf,
    rwElif,
    rwElse,
    rwFor,
    rwWhile,
    rwReturn,
    rwVoid,
    opAssign,
    opLogicAnd,
    opLogicOr,
    opNot,
    opPlus,
    opMinus,
    opMult,
    opExp,
    opRel,
    opEquals,
    unknown
}

