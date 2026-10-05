package com.devops;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CropAdvisoryTest {

    @Test
    void shouldRecommendCottonForBlackSoil() {
        CropAdvisory advisory = new CropAdvisory();

        assertEquals("Cotton",
                advisory.recommendCrop("Black", "Kharif"));
    }

    @Test
    void shouldRecommendRiceForAlluvialSoil() {
        CropAdvisory advisory = new CropAdvisory();

        assertEquals("Rice",
                advisory.recommendCrop("Alluvial", "Kharif"));
    }

    @Test
    void shouldRecommendGroundnutForRedSoil() {
        CropAdvisory advisory = new CropAdvisory();

        assertEquals("Groundnut",
                advisory.recommendCrop("Red", "Rabi"));
    }

    @Test
    void shouldGiveAdviceForUnknownCombination() {
        CropAdvisory advisory = new CropAdvisory();

        assertEquals(""Please consult an agricultural expert",
                advisory.recommendCrop("Sandy", "Summer"));
    }
}