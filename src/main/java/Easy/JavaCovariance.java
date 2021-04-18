package Easy;

public class JavaCovariance {
    // It's really easy to get confused as to what 'Covariance' is and whats going on
    // But it's simple: Pre Java 5 you couldn't @override the return type, now you can
    // This is called covariance (vary together).

    class Flower {
        public String whatsYourName() {
            return "";
        }
    }

    class Jasmine extends Flower{
        @Override
        public String whatsYourName() {
            return "Jasmine";
        }
    }

    class Lily extends Flower{
        @Override
        public String whatsYourName() {
            return "Lily";
        }
    }

    class Region {
        public Flower yourNationalFlower() {
            return new Flower();
        }
    }

    class WestBengal extends Region{
        @Override
        public Flower yourNationalFlower() {
            return new Jasmine();
        }
    }

    class AndhraPradesh extends Region{
        @Override
        public Flower yourNationalFlower() {
            return new Lily();
        }

    }
}
