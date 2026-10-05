package com.devops;

public class CropAdvisory {

    public String recommendCrop(String soilType, String season) {

        if (soilType.equalsIgnoreCase("Black")
                && season.equalsIgnoreCase("Kharif")) {
            return "Cotton";
        }

        if (soilType.equalsIgnoreCase("Alluvial")
                && season.equalsIgnoreCase("Kharif")) {
            return "Rice";
        }

        if (soilType.equalsIgnoreCase("Red")
                && season.equalsIgnoreCase("Rabi")) {
            return "Groundnut";
        }

        return "Consult an agricultural expert";
    }
}