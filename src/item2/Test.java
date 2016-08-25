package item2;

public class Test {

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.BuilderNutrition(240, 8) //
                .calories(100) //
                .sodium(35) //
                .carbohydrate(27) //
                .build();
    }
}
