package observer;

public interface Subject {
	public void regiterObserver (Observer o);
	public void removeObserver (Observer o);
	public void notifyObservers();
}
