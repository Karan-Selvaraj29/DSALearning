// 1. Abstract Product Interfaces
interface Button {
    void paint();
}

interface Checkbox {
    void paint();
}

// 2. Concrete Products for Windows
class WindowsButton implements Button {
    public void paint() {
        System.out.println("Rendering a Windows-style Button");
    }
}

class WindowsCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Rendering a Windows-style Checkbox");
    }
}

// 3. Concrete Products for Mac
class MacButton implements Button {
    public void paint() {
        System.out.println("Rendering a Mac-style Button");
    }
}

class MacCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Rendering a Mac-style Checkbox");
    }
}

// 4. Abstract Factory
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// 5. Concrete Factories
class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

// 6. Client Class
class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.paint();
        checkbox.paint();
    }
}

// 7. Main Class
public class AbstractFactoryExample {
    public static void main(String[] args) {
        // Switch between MacFactory or WindowsFactory here
        GUIFactory factory;

        // Let's simulate getting OS dynamically (hardcoded for example)
        String osType = "Windows"; // change to "Mac" to test Mac GUI

        if (osType.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        // Create application with selected factory
        Application app = new Application(factory);
        app.renderUI();
    }
}
