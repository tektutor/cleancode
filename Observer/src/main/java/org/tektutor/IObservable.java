package org.tektutor;


public interface IObservable {

	void addObserver ( Observer observer, String magazine );
	void notify ( String magazine );

}
