package prac24;
interface Chair {
    void sit();
}
class VictorianChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидим на викторианском стуле");
    }
}
class MultifunctionalChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидим на многофункциональном стуле");
    }
}
class MagicChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидим на магическом стуле");
    }
}
interface ChairFactory {
    Chair createChair();
}
class VictorianChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
class MultifunctionalChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}
class MagicChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}
class Client {
    public void sit(Chair chair) {
        chair.sit();
    }
}
public class Main {
    public static void main(String[] args) {
        ChairFactory victorianFactory = new VictorianChairFactory();
        ChairFactory multifunctionalFactory = new MultifunctionalChairFactory();
        ChairFactory magicFactory = new MagicChairFactory();
        Client client = new Client();
        Chair victorianChair = victorianFactory.createChair();
        Chair multifunctionalChair = multifunctionalFactory.createChair();
        Chair magicChair = magicFactory.createChair();
        client.sit(victorianChair);
        client.sit(multifunctionalChair);
        client.sit(magicChair);
    }
}