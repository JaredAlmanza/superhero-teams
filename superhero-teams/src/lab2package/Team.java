package lab2package;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Team {
    private String teamName;
    private List<Superhero> superheroes;

    public Team(String teamName) {
        this.teamName = teamName;
        this.superheroes = new ArrayList<>();
    }

    public void loadHeroes(String filename) throws IOException {
        InputStream inputStream = getClass().getResourceAsStream(filename);
        if (inputStream == null) {
            throw new FileNotFoundException("File not found in the package: " + filename);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            String realName = parts[0];
            String heroName = parts[1];
            String gender = parts[2];
            int heightFeet = Integer.parseInt(parts[3]);
            int heightInches = Integer.parseInt(parts[4]);
            double weight = Double.parseDouble(parts[5]); // Change here
            boolean hasPowers = parts[6].equals("T");
            String residenceLocation = parts[7];
            superheroes.add(new Superhero(realName, heroName, gender, heightFeet, heightInches, weight, hasPowers, residenceLocation));
        }
        br.close();
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Team " + teamName + ":\n");
        for (Superhero superhero : superheroes) {
            result.append(superhero.toString());
        }
        return result.toString();
    }
}
