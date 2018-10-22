package br.ufal.ic.lexic;

public class Token {
    private TokenCategory category;
    private int tokenLine;
    private int tokenColumn;
    private String value;

    public Token(String value, int tokenLine, int tokenColumn, TokenCategory category) {
        this.setCategory(category);
        this.setTokenLine(tokenLine);
        this.setTokenColumn(tokenColumn);

        if (category == TokenCategory.consString || category == TokenCategory.consChar) {
            this.setValue(value.substring(1, value.length() - 1));
        } else {
            this.setValue(value);
        }
    }

    public TokenCategory getCategory() {
        return category;
    }

    public void setCategory(TokenCategory category) {
        this.category = category;
    }

    public int getTokenLine() {
        return tokenLine + 1;
    }

    public void setTokenLine(int tokenLine) {
        this.tokenLine = tokenLine;
    }

    public int getTokenColumn() {
        return tokenColumn + 1;
    }

    public void setTokenColumn(int tokenColumn) {
        this.tokenColumn = tokenColumn;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String fmt = "        [%04d, %04d] (%04d, %10s) {%s}";
        return String.format(fmt, tokenLine+1, tokenColumn+1, category.ordinal(), category.toString(), value);
    }
}
