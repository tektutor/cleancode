package org.tektutor;

import java.lang.ref.WeakReference; 


public class SingletonWeakReference {
	private static WeakReference<SingletonWeakReference> instance = null;

	static {
		instance = WeakReference<SingletonWeakReference>(new SingletonWeakReference());
	}

	private SingletonWeakReference() {
	} 

	public static SingletonWeakReference getInstance() {
		
		if ( null == instance.get() )
			throw new Exception();
		
		return instance.get();
	}

}
