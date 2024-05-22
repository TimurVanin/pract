package list1.prac4;
public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel", "Core i7", 3.5);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("ASUS", 27);
        Computer myComputer = new Computer(ComputerBrand.ASUS, processor, memory, monitor);
        System.out.println(myComputer+"\n\n\n");
        Season myFavoriteSeason = Season.Лето;
        System.out.println("Мое любимое время года: " + myFavoriteSeason);
        System.out.println("Средняя температура: " + myFavoriteSeason.getAverageTemperature());
        System.out.println("Описание: " + myFavoriteSeason.getDescription());
        printSeasonDescription(Season.Лето);
        for (Season season : Season.values()) {
            System.out.println(season + ", средняя температура: " + season.getAverageTemperature() + ", " + season.getDescription());
        }
    }
    public static void printSeasonDescription(Season season) {
        switch (season) {
            case Лето:
                System.out.println("Я люблю лето");
                break;
            case Весна:
                System.out.println("Я люблю весну");
                break;
            case Осень:
                System.out.println("Я люблю осень");
                break;
            case Зима:
                System.out.println("Я люблю зиму");
                break;
        }
    }
}