package edu.monmouth.inclass1;

public class MusicalInstrument {

    private static final String UNKNOWNNAME = "UNKNOWNNAME";
    private static final String UNKNOWNTYPE = "UNKNOWNTYPE";
    private static final int UNKNOWNKEYSORSTRINGS = -1;
    private static final int MIN_KEYS_OR_STRINGS = 0;
    private static final int MAX_KEYS_OR_STRINGS = 100;

    private String name;
    private String type;
    private int numberOfKeysorStrings;

    public MusicalInstrument() {
        setName(UNKNOWNNAME);
        setType(UNKNOWNTYPE);
        setNumberOfKeysorStrings(UNKNOWNKEYSORSTRINGS);
    }

    public MusicalInstrument(String name, String type, int numberOfKeysorStrings) {
        setName(name);
        setType(type);
        setNumberOfKeysorStrings(numberOfKeysorStrings);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfKeysorStrings() {
        return numberOfKeysorStrings;
    }


    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = UNKNOWNNAME;
        } else {
            this.name = name;
        }
    }

    public void setType(String type) {
        if (type == null || type.trim().isEmpty()) {
            this.type = UNKNOWNTYPE;
        } else {
            String lowerType = type.toLowerCase();
            if (lowerType.equals("woodwind") || lowerType.equals("string") ||
                lowerType.equals("brass") || lowerType.equals("keyboard") ||
                lowerType.equals("percussion")) {
                this.type = lowerType;
            } else {
                this.type = UNKNOWNTYPE;
            }
        }
    }

    public void setNumberOfKeysorStrings(int numberOfKeysorStrings) {
        if (numberOfKeysorStrings < MIN_KEYS_OR_STRINGS || 
            numberOfKeysorStrings > MAX_KEYS_OR_STRINGS) {
            this.numberOfKeysorStrings = UNKNOWNKEYSORSTRINGS;
        } else {
            this.numberOfKeysorStrings = numberOfKeysorStrings;
        }
    }
}
