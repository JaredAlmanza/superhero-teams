package lab2package;

class Superhero {
    private String realName;
    private String heroName;
    private String gender;
    private int heightFeet;
    private int heightInches;
    private double weight; // Change here
    private boolean hasPowers;
    private String residenceLocation;

    public Superhero(String realName, String heroName, String gender, int heightFeet, int heightInches,
            double weight, boolean hasPowers, String residenceLocation) { // Change here
        this.realName = realName;
        this.heroName = heroName;
        this.gender = gender;
        this.heightFeet = heightFeet;
        this.heightInches = heightInches;
        this.weight = weight;
        this.hasPowers = hasPowers;
        this.residenceLocation = residenceLocation;
    }

    @Override
    public String toString() {
        String height = heightFeet + "'" + heightInches + "\"";
        String powers = hasPowers ? "Yes" : "No";
        return "- " + heroName + "\n" +
                "Real Name: " + realName + "\n" +
                "Gender: " + gender + "\n" +
                "Height: " + height + "\n" +
                "Weight: " + weight + "\n" +
                "Powers: " + powers + "\n" +
                "Location: " + residenceLocation + "\n";
    }
}
