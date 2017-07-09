package BehavioralPatterns.Visitor;

class EngineElement implements Element{

    @Override
    public void accept(User user) {
        user.use(this);
    }
}
