
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class BuilderNutrition implements Builder<NutritionFacts> {
        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public BuilderNutrition(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public BuilderNutrition calories(int calories) {
            this.calories = calories;
            return this;
        }

        public BuilderNutrition fat(int fat) {
            this.fat = fat;
            return this;
        }

        public BuilderNutrition sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public BuilderNutrition carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(BuilderNutrition builder) {
        this.calories = builder.calories;
        this.carbohydrate = builder.carbohydrate;
        this.fat = builder.fat;
        this.servings = builder.servings;
        this.servingSize = builder.servingSize;
        this.sodium = builder.sodium;
    }
}
