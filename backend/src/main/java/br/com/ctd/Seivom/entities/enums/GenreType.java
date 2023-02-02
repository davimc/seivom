package br.com.ctd.Seivom.entities.enums;

public enum GenreType {

    ROMANCE(1, "Românce"),
    TERROR(2, "Terror"),
    COMEDY(3, "comédia"),
    ACTION(4, "ação"),
    ADVENTURE(5,"Aventura");

    private int cod;
    private String description;

    GenreType(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static GenreType toEnum(Integer cod) {
        if(cod == null) return null;
        for(GenreType g: GenreType.values())
            if(cod.equals(g.getCod()))
                return g;
        throw new IllegalArgumentException("Gênero inválido");
    }
}
