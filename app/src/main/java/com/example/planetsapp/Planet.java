package com.example.planetsapp;

public class Planet {
    private String planetName;
    private String moonCount;
    private int planetImage;

    public Planet(String planetName, String moonCount, int moonImage) {
        this.planetName = planetName;
        this.moonCount = moonCount;
        this.planetImage = moonImage;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public int getMoonImage() {
        return planetImage;
    }

    public void setMoonImage(int moonImage) {
        this.planetImage = moonImage;
    }
}
