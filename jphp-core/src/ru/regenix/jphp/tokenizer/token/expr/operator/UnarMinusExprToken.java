package ru.regenix.jphp.tokenizer.token.expr.operator;

import php.runtime.common.Association;
import php.runtime.Memory;
import ru.regenix.jphp.tokenizer.TokenType;
import ru.regenix.jphp.tokenizer.TokenMeta;
import ru.regenix.jphp.tokenizer.token.expr.OperatorExprToken;

public class UnarMinusExprToken extends OperatorExprToken {
    public UnarMinusExprToken(TokenMeta meta) {
        super(meta, TokenType.T_J_UNAR_MINUS);
    }

    @Override
    public Association getOnlyAssociation() {
        return Association.RIGHT;
    }

    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public int getPriority() {
        return 20;
    }

    @Override
    public String getCode() {
        return "negative";
    }

    @Override
    public Memory calc(Memory o1, Memory o2) {
        return o1.negative();
    }
}