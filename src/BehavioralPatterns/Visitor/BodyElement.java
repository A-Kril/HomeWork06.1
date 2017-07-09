package BehavioralPatterns.Visitor;

class BodyElement implements Element{

    @Override
    public void accept(User user) {
        user.use(this);
    }
}
