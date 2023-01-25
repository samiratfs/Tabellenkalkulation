public interface Subjekt {
    public void addZelle(Observer observer);
    public void deleteZelle(Observer observer);
    public void notifyObservers();
}
