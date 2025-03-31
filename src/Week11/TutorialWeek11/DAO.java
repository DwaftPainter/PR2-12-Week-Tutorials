package Week11.TutorialWeek11;

abstract class DAO <Entity> {
    java.util.ArrayList<Entity> list = new java.util.ArrayList<>();

    void add(Entity entity) {
        list.add(entity);
    };

    void remove(Entity entity) {
        list.remove(entity);
    };

    java.util.ArrayList<Entity> getList() {
        return this.list;
    };

    abstract void update(Entity entity);
    abstract Entity find(java.io.Serializable id);
}
