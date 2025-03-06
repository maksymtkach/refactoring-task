public class HumanBMI {
    public double weight;
    public double height;

    public HumanBMI(double weight, double height) {
        setWeight(weight);
        setHeight(height);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            System.out.println("Weight cannot be negative");
        } else if (weight == 0) {
            System.out.println("Weight cannot be 0 (zero)");
        }else {
            this.weight = weight;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            System.out.println("Height cannot be negative");
        } else if (height == 0) {
            System.out.println("Height cannot be 0 (zero)");
        } else {
            this.height = height;
        }
    }

    public double getBMI() {
        return weight / (height * height);
    }

    public String getResult() {
        double bmi = getBMI();
        if (bmi >= 18.5 && bmi < 25) return "Normal";
        if (bmi >= 25 && bmi < 30) return "Overweight";
        if (bmi >= 30) return "Obese";
        return "Underweight";
    }
}
