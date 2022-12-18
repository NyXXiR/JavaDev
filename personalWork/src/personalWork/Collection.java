package personalWork;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface Collection<T> extends Iterable<T> {
	default Stream<T> stream(){
		return StreamSupport.stream(spliterator(), false);
	}

}
