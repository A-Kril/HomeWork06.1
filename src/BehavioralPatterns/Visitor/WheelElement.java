package BehavioralPatterns.Visitor;

class WheelElement implements Element{
    private String name;

    public WheelElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(User user) {
        user.use(this);
    }
}
