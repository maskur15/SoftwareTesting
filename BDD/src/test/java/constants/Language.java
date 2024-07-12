package constants;

public enum Language {
    Spanish("es"),
    English("en"),
    French("fr"),
    German("de"),
    Itilian("it"),
    Español("es"),
    Japanase("ja");

    private final String value;

    Language(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Language fromString(String text) {
        for (Language lang : Language.values()) {
            if (lang.name().equalsIgnoreCase(text)) {
                return lang;
            }
        }
        throw new IllegalArgumentException("No constant with text " + text + " found");
    }
}
