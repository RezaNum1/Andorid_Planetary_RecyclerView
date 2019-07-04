package com.example.planetary;

import java.util.ArrayList;

public class PlanetData {

    public static String[][] data = new String[][]{
            {"Mercury", "Mercury is smallest and innermost planet in the solar system, Its Orbital period around the sun of 87.97 days is the shortest of al planet in the Solar system", "https://en.wikipedia.org/wiki/File:Mercury_in_color_-_Prockter07-edit1.jpg"},
            {"Venus", "Venus is the second plante of the Solar System and from the sun, orbiting it every 224.7 Earth days. it has the longest rotation period of any planet in the Solar System", "https://en.wikipedia.org/wiki/File:Venus-real_color.jpg"},
            {"Earth", "is the third planet of Solar system and from the Sun, Earth the only astronomic object known to harbor life, According to radiometric dating and other source of evidence Earth formed over 4.5 billion years Ago", "https://cdn.britannica.com/s:500x350/25/160325-004-AD594C66.jpg"},
            {"Mars", "is the fourth planet from Solar system and from The sun, Second-smallest planet in th Solar System and have Red Surface", "https://en.wikipedia.org/wiki/File:OSIRIS_Mars_true_color.jpg"},
            {"Jupiter", "Jupiter Is the fifth planet in the Solar system and from the sun, Jupiter is the largest planet in the Solar Sytem, Jupiter primarily composed of Hydrogen", "https://en.wikipedia.org/wiki/File:Jupiter_and_its_shrunken_Great_Red_Spot.jpg"},
            {"Saturn", "Saturn Is the sixth planet in The Soalr System and from the Sun, Saturn is the Second planet the largest in the Solar system, Maybe it's size similar of Venus the Largest planet in the Bima Sakti Solar Sytem", "https://en.wikipedia.org/wiki/File:Saturn_during_Equinox.jpg"},
            {"Uranus", "Uranus is the Sevnth palnet in the solar system, Usually Uranus also called Blue Planet, Because it has blue surface almost all the part of the planet","https://en.wikipedia.org/wiki/File:Uranus2.jpg"},
            {"Neptune", "Neptune is the eighth and the last palnet of the Our solar system, Uranus is the densest giant planet, Neptune is not visible to the unaided eye, is the only planet in the solar system found by mathematical predicition", "https://en.wikipedia.org/wiki/File:Neptune_Full.jpg"},

    };

    public static ArrayList<Planet> getListData(){
        ArrayList<Planet> list = new ArrayList<>();

        for (String[] aData : data){
            Planet planet = new Planet();
            planet.setName(aData[0]);
            planet.setContent(aData[1]);
            planet.setPhoto(aData[2]);

            list.add(planet);
        }

        return list;
    }
}
