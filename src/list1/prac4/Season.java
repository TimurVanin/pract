package list1.prac4;
enum Season {
    Весна(15),
    Лето(30),
    Осень(20),
    Зима(0);
    private int averageTemperature;
    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }
    public int getAverageTemperature() {
        return averageTemperature;
    }
    public String getDescription() {
        if (this == Лето) {
            return "Теплое время года";
        } else {
            return "Холодное время года";
        }
    }
}
